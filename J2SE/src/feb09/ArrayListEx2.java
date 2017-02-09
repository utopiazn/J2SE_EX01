package feb09;

import java.util.*;
import static java.lang.System.out;

public class ArrayListEx2 {
	
	public static void main(String[] args){
		
		
		final int LIMIT = 10; // 자르고자 하는 굴자의 개수를 지정한다,
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		int length = source.length();
		
		out.println("원본 :"+source); 	
		
		
		// 크기를 약간 여유있게 잡는다.
		List<String> list = new ArrayList<String>(length/LIMIT + 10);
		
		for(int i=0; i<length; i+=LIMIT){
			
			if(i+LIMIT <length)
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
			
		}
		
		
		out.println("========결과=================="); 	
		
		for(String l: list){			
			out.println(l); 			
		}
		
	}
	
	

}
/*
원본 :0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ
========결과==================
0123456789
abcdefghij
ABCDEFGHIJ
!@#$%^&*()
ZZZ
*/

