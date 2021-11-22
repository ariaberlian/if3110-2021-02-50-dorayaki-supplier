package com.jayen.seereq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SeeReqGetter {
	public static String see_req(String ip) {
		String request_list = null;
		try{  
			URL url=new URL("http://localhost:3000/request-toko?ip="+ip);    
			HttpURLConnection huc=(HttpURLConnection) url.openConnection();  

			// catch http get body
			StringBuilder sb;
			BufferedReader br = null;
			if (huc.getResponseCode() == 200) {
			    br = new BufferedReader(new InputStreamReader(huc.getInputStream()));

			    sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line+"\n");
                }
                br.close();
			} else {
			    br = new BufferedReader(new InputStreamReader(huc.getErrorStream()));

			    sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line+"\n");
                }
                br.close();
			    
			}
			
			
			request_list = sb.toString();
			System.out.println(request_list);
			
			

			huc.disconnect();   
			}catch(Exception e){
				System.out.println(e); 
				request_list = e.toString();
			} 
		return request_list;
	
	}
}
