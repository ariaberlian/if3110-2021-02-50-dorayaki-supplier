package com.jayen.addstok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

public class AddStokPoster {

	public static String postIt(String ip, String variant, int num) throws IOException{
		String response = null;
		try{  
			URL url=new URL("http://localhost:3000/add-request-toko");    
			
			Map<String,Object> params = new LinkedHashMap<>();
	        params.put("ip", ip);
	        params.put("varian", variant);
	        params.put("jumlah_penambahan", num);
	        
	        StringBuilder postData = new StringBuilder();
	        for (Map.Entry<String,Object> param : params.entrySet()) {
	            if (postData.length() != 0) postData.append('&');
	            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
	            postData.append('=');
	            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
	        }
	        byte[] postDataBytes = postData.toString().getBytes("UTF-8");

	        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
	        conn.setRequestMethod("POST");
	        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
	        conn.setDoOutput(true);
	        conn.getOutputStream().write(postDataBytes);
	        
	        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
	        
	        StringBuilder sb = new StringBuilder();
	        for (int c; (c = in.read()) >= 0;)
	            sb.append((char)c);
	        response = sb.toString();
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return response;
	}
}
