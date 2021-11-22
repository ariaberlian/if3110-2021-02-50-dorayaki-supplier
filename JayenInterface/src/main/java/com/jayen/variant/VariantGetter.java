package com.jayen.variant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class VariantGetter {

	public static String doGet() throws IOException{
		String variant_list = null;
		try{  
			URL url=new URL("http://localhost:3000/resep");    
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
			
			
			variant_list = sb.toString();
			System.out.println(variant_list);
			
			

			huc.disconnect();   
			}catch(Exception e){
				System.out.println(e); 
				variant_list = e.toString();
			} 
		return variant_list;
	}
}
