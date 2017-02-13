package feb13;

import java.util.Arrays;
import static java.lang.System.out;

public class ArraysEx1 {
	
	static void print(String[] ar){
		
		for(String str : ar){
			out.print(str+",");
		}
		
	}
	
	public static void main(String[] args){
		
		String[] ar = {"fill()","in","the","Arrays"};
		
		//일관 적용		
		Arrays.fill(ar, "SunAe"); //배열의 요소들을 "SunAe"으로 채운다		
		print(ar);//SunAe,SunAe,SunAe,SunAe,	
		
		out.println("\n-------------------------------------");
		
		Arrays.fill(ar,1,3,"♥");		
		print(ar);//SunAe,♥,♥,SunAe,
			
		
		
	}

}
