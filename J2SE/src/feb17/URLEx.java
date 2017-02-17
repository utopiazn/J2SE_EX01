package feb17;

import java.net.*;
import java.io.*;
import static java.lang.System.out;

public class URLEx {

	public static void main(String[] args) throws MalformedURLException,IOException{
		
		URL url = new URL("http", "java.sun.com", 8800,	"index.jsp?name=syh1011#content");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		int defaultPort = url.getDefaultPort(); //80
		
		String path  = url.getPath();
		String query = url.getQuery();
		String ref 	 = url.getRef();
		String _url  = url.toExternalForm();
		
		String mixUrl = null;
		
		if(port ==-1){
			mixUrl = protocol + "//"+host + "/" + path + "?" + query + "#" +ref;
		}else{
			mixUrl = protocol + "//" + host + ":"+ port +"/"+path+"?"+query + "#" +ref;
		}
		
		if(port == -1)
			port = url.getDefaultPort();
		
		
		out.printf("프로토콜 : %s \n",protocol);
		out.printf("호스트 : %s \n", host);
		out.printf("포트 : %d \n", port );
		out.printf("패스 : %s \n", path);
		out.printf("쿼리 : %s \n", query);
		out.printf("ref : %s \n", ref);
		out.printf("mixURL : %s \n",mixUrl);
		out.printf("URL : %s \n", _url);
		/*
		프로토콜 : http 
		호스트 : java.sun.com 
		포트 : 8800 
		패스 : index.jsp 
		쿼리 : name=syh1011 
		ref : content 
		mixURL : http//java.sun.com:8800/index.jsp?name=syh1011#content 
		URL : http://java.sun.com:8800index.jsp?name=syh1011#content 
		*/
		
		url = new URL("http://docs.oracle.com/javase/7/docs/api/overview-summary.html");
		InputStream input = url.openStream();
		
		int readByte;
		
		out.println("=== 문서의 내용 ===");
		
		while((readByte = input.read()) != -1){
			out.print((char) readByte);
		}
		
		input.close();
		

	}
	
	
}


/*
 * 연습문제 url = new URL("http://www.korea.com"); InputStream input =
 * url.openStream(); InputStreamReader isr = new InputStreamReader(input);
 * BufferedReader br = new BufferedReader(isr); String message = null;
 * while((message = br.readLine()) != null){ System.out.println(message); }
 * input.close(); isr.close(); br.close();
 */


