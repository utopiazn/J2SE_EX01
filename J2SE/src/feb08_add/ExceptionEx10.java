package feb08_add;

import static java.lang.System.out;

public class ExceptionEx10 {
	
	
	// 0으로 나눠서 ArithmeticException을 발생시킨다.	
	public static void main(String[] args){
		
		out.println(1);
		out.println(2);
		
		
		try{
			out.println(3);
			out.println(0/0);  // 실행되지 않는다.
			out.println(4);	   // ArithmeticException을 사용.
			
		}catch(Exception e){
			
			out.println(5);
			
		}
		
		
		out.println(6);
		
	}

}

/* 결과

1
2
3
5
6


*/