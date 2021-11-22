package com.jayen.seereq;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface SeeRequestStatusService {
	@WebMethod
	public String see_request_status(String ip);
}
