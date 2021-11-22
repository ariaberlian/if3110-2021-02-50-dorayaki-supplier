package com.jayen.variant;

import javax.jws.WebService;

import java.io.IOException;


import javax.jws.WebMethod;

@WebService
public interface VariantService{

	
	@WebMethod
	public String getVariantList(String ip) throws IOException;
}
