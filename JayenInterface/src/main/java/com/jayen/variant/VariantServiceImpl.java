package com.jayen.variant;

import java.io.IOException;
import java.sql.SQLException;
import com.jayen.limiter.RateLimiter;

public class VariantServiceImpl implements VariantService {
	
	@Override
	public String getVariantList(String ip) throws IOException{

		boolean limited=false;
		try {
			limited = RateLimiter.rate_limit(ip,"http://localhost:8080/JayenInterface/services/VariantServiceImpl");
			System.out.println(limited);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Exception";
		}

		if(!limited) {
			try {
				return VariantGetter.doGet();
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
