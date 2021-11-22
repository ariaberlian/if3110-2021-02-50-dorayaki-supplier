package com.jayen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VariantGetter extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		try{  
			
			URL url=new URL("http://localhost:3000/resep");    
			HttpURLConnection huc=(HttpURLConnection) url.openConnection();  
//			for(int i=1;i<=8;i++){  
//				System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
//			}

			// catch http get body
			StringBuilder sb;
			BufferedReader br = null;
			if (huc.getResponseCode() == 200) {
			    br = new BufferedReader(new InputStreamReader(huc.getInputStream()));
//			    String strCurrentLine;
//			        while ((strCurrentLine = br.readLine()) != null) {
//			               System.out.println(strCurrentLine);
//			        }
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
			
			
			String varian = sb.toString();
			System.out.println(varian);
			
			

			huc.disconnect();   
			}catch(Exception e){
				System.out.println(e); 
			}    

	}
}
