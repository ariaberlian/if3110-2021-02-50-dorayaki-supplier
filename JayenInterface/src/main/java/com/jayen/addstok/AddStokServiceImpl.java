package com.jayen.addstok;

import java.io.IOException;
import java.sql.SQLException;

import com.jayen.limiter.*;
public class AddStokServiceImpl implements AddStokService {
	
	@Override
	public String add_stok(String ip, String variant, int num) {
		boolean limited=false;
		try {
			limited = RateLimiter.rate_limit(ip, "http://localhost:8080/JayenInterface/services/AddStokServiceImpl");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Exception";
		}

		if(!limited) {
			try {
				return AddStokPoster.postIt(ip, variant, num);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "Exception";
			}
		}else {
			return "Permintaan Anda dibatasi 10/menit";
		}
	}

}
