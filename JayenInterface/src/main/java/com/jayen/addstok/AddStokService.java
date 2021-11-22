package com.jayen.addstok;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface AddStokService {

	@WebMethod
	public String add_stok(String ip, String variant, int num);
}
