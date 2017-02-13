package feb13;

import java.util.Arrays;
import static java.lang.System.out;


public class ArraysEx2 {
	
	static void print(String [] ar){
		
		for(String str : ar){
			
			out.print(str+",");
		}
	}
	
	
	public static void main(String[] args){
		String[] ar1 = {"fill()","in","the","Arrays"};
		String[] ar2 = {"fill()","in","","Arrays"};
		
		
		if(!Arrays.equals(ar1, ar2)){
			out.println("두배열이 다릅니다.");
		}
		
		out.println("-------------------------------");
		
		
		Arrays.fill(ar2, 2,3, "the");
		print(ar2);// ar2 = fill(),in,the,Arrays,
		
		
		if(!Arrays.equals(ar1, ar2)){
			out.println("\n두배열이 다릅니다.");
		}else{
			out.println("\n두배열이 같습니다.");
		}
		
		
	}

}
/* 결과
두배열이 같습니다.
*/