package feb17;

import java.net.*;
import static java.lang.System.out;


public class NetworkEx2 {
	
	public static void main(String[] args) throws Exception{
		
		URL url = new URL("http://docs.oracle.com/javase/7/docs/api/overview-summary.html");

		
		
		out.println("url.getAuthority():"+url.getAuthority()); //docs.oracle.com

		out.println("url.getContent():"+url.getContent());//sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@3e3abc88
		
		out.println("url.getDefaultPort():"+url.getDefaultPort());  //url.getDefaultPort():80    ::: 기본 80
		
		out.println("url.getPort():"+url.getPort()); //url.getPort():-1
		
		out.println("url.getFile():"+url.getFile()); //url.getFile():/javase/7/docs/api/overview-summary.html
		
		out.println("url.getHost():"+url.getHost()); //url.getHost():docs.oracle.com

		out.println("url.getPath():"+url.getPath()); //url.getPath():/javase/7/docs/api/overview-summary.html
		
		out.println("url.getProtocol():"+url.getProtocol()); //url.getProtocol():http
	
		out.println("url.getQuery():"+url.getQuery());// url.getQuery():null
		
		out.println("url.getRef():"+url.getRef()); //url.getRef():null
		
		out.println("url.getUserInfo():"+url.getUserInfo());//url.getUserInfo():null
		
		out.println("url.toExternalForm():"+url.toExternalForm());//url.toExternalForm():http://docs.oracle.com/javase/7/docs/api/overview-summary.html

		out.println("url.toURI():"+url.toURI());//url.toURI():http://docs.oracle.com/javase/7/docs/api/overview-summary.html
		
		
		
	}

}
