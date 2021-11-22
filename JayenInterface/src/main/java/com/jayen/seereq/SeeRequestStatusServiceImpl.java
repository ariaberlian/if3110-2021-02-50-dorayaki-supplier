package com.jayen.seereq;

import java.sql.SQLException;

import com.jayen.limiter.RateLimiter;

public class SeeRequestStatusServiceImpl implements SeeRequestStatusService {

	@Override
	public String see_request_status(String ip) {
		boolean limited=false;
		try {
			limited = RateLimiter.rate_limit(ip,"http://localhost:8080/JayenInterface/services/SeeRequestStatusServiceImpl");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Exception";
		}
		if(!limited) {
			try {
				return SeeReqGetter.see_req(ip);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "Exception";
			}
		}else {
			return "Permintaan Anda dibatasi 10/menit";
		}
		
	}

}
