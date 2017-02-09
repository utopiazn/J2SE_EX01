package feb09;

import java.util.*;
import static java.lang.System.out;

public class HashSetEx1 {
	
	public static void main(String[] args){
		
		String[] str = {"Java","Beans","Java","XML"};
		
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		
		for(String n : str){
			
			if(!hs1.add(n)){
				hs2.add(n); //Java 종복될경 별도 저저ㅏㅇ
			}
			
		}
		
		
		out.println("hs1 : "+hs1); // "Java","Beans","XML"
		hs1.remove(hs2);
		
		out.println("hs1 : "+hs1); // "Beans","XML"
		out.println("hs2 : "+hs2); // "Java"
		
	}

}

/*
hs1 : [Java, Beans, XML]
hs1 : [Java, Beans, XML]
hs2 : [Java]
*/