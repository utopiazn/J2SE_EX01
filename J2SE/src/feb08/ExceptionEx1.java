package feb08;

import static java.lang.System.out;


/*
 예외처리가 발생함 배열은 2개 까지 인데 3개를 호출하여 발생함.

*/

public class ExceptionEx1 {
	
	public static void main(String[] args){
		
		int[] var = {10,200,30};
		
		for(int i = 0; i <= 3; i++){			
			
			out.println("var["+i+"] : "+ var[i]);		
			
		}
		
		out.println("프로그램 끝!");
		
		
	}

}
