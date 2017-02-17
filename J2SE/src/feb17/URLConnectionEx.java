package feb17;

import java.net.*;
import java.io.*;
import java.util.*;
import static java.lang.System.out;


public class URLConnectionEx {

	public static void main(String[] args) throws Exception{
		
		URL url = new URL("http://docs.oracle.com/javase/7/docs/api/overview-summary.html");
		URLConnection urlCon = url.openConnection();
		urlCon.connect();
		
		Map<String,List<String>> map = urlCon.getHeaderFields();
		
		Set<String> s = map.keySet();
		Iterator<String> iterator = s.iterator();
		
		while(iterator.hasNext()){
			String name = iterator.next();
			out.print(name+ " : ");
			List<String> value = map.get(name);
			
			for(String _temp : value){
				out.println(_temp);
			}
		}
		
		int len = urlCon.getContentLength();
		
		out.println("문서의 길이  : "+len + " 바이트");
		
		if(len > 0){
			
			InputStream input = urlCon.getInputStream();
			out.println("=== 문서의 내용 ===");
			
			int readByte;
			
			while((((readByte = input.read()))!= -1) && (--len>0)){
				out.print((char)readByte);
				
			}
			
			
		}else{
			out.println("내용이 없음");
			
		}
		
		
		
		
	}
	
}
