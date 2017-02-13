package feb13;

import java.util.Arrays;
import static java.lang.System.out;

public class ArraysEx3 {

	public static void main(String[] args){
		int[] ar1 = {6,3,7,2,1};
		
		Arrays.sort(ar1); // 정렬
		
		for(int n : ar1){
			
			
			out.print(n+","); 
		}
		//1,2,3,6,7,
		
		
	}
}
