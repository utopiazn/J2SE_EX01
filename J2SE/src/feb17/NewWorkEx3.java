package feb17;

import java.net.*;
import java.io.*;
import static java.lang.System.out;

public class NewWorkEx3 {

	public static void main(String[] args){
		
		URL url = null;

		String address = "http://docs.oracle.com/javase/7/docs/api/overview-summary.html";
		String line = "";

		try{
			
			url = new URL(address);
			URLConnection conn = url.openConnection();
			
			//conn,toString() : sun.net.www.protocol.http.HttpURLConnection:http://docs.oracle.com/javase/7/docs/api/overview-summary.html
			out.println("conn,toString() : "+conn);

			//getAllowUserInteraction() : false
			out.println("getAllowUserInteraction() : "+conn.getAllowUserInteraction());
			
			//getConnectTimeout() : 0
			out.println("getConnectTimeout() : "+conn.getConnectTimeout());
			
			//getContent() : sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@3e3abc88
			out.println("getContent() : "+conn.getContent());
			
			//getContentEncoding() : null
			out.println("getContentEncoding() : "+conn.getContentEncoding());
						
			//getContentLength() : 64828
			out.println("getContentLength() : "+conn.getContentLength());
			
			//getContentType() : text/html
			out.println("getContentType() : "+conn.getContentType());
			
			//getDate() : 1487299855000
			out.println("getDate() : "+conn.getDate());
			
			//getDefaultAllowUserInteraction() : false
			out.println("getDefaultAllowUserInteraction() : "+conn.getDefaultAllowUserInteraction());
			
			//getDefaultUseCaches() : true
			out.println("getDefaultUseCaches() : "+conn.getDefaultUseCaches());
			
			//getDoInput() : tru
			out.println("getDoInput() : "+conn.getDoInput());
			
			//getDoOutput() : false
			out.println("getDoOutput() : "+conn.getDoOutput());
						
			//getExpiration() : 0
			out.println("getExpiration() : "+conn.getExpiration());
			
			//conn.getHeaderFields() : {Accept-Ranges=[bytes], null=[HTTP/1.1 200 OK], Server=[Apache], ETag=["ad714a27db611e5c1c5b6e5c211ee282:1453216400"], Connection=[keep-alive], Last-Modified=[Wed, 13 Jan 2016 18:53:03 GMT], Content-Length=[64828], Date=[Fri, 17 Feb 2017 02:56:14 GMT], Content-Type=[text/html]}
			out.println("conn.getHeaderFields() : "+conn.getHeaderFields());
			
			//getIfModifiedSince() : 0
			out.println("getIfModifiedSince() : "+conn.getIfModifiedSince());
			
			//getLastModified() : 1452711183000
			out.println("getLastModified() : "+conn.getLastModified());
			
			//getReadTimeout() : 0
			out.println("getReadTimeout() : "+conn.getReadTimeout());
			
			//getURL() : http://docs.oracle.com/javase/7/docs/api/overview-summary.html
			out.println("getURL() : "+conn.getURL());
			
			//getUseCaches() : true
			out.println("getUseCaches() : "+conn.getUseCaches());		
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
