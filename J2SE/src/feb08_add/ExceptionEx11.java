package feb08_add;

import static java.lang.System.out;

public class ExceptionEx11 {

	// 0으로 나눠서 ArithmeticException을 발생시킨다.	
	public static void main(String[] args){
		
		out.println(1);
		out.println(2);
		
		try{
			
			out.println(3);
			out.println(0/0);// 오류 발생
			out.println(4);  // 실행되지 않는다
			
			
		}catch(ArithmeticException ae){
			
			if(ae instanceof ArithmeticException){
				out.println("true");				
			}
			out.println("ArithmeticException ");
			
			
		}catch(Exception e){ // ArithmeticException 제외한 모든 예외처리.
			out.println("Exception"); 
		
		}
		
		out.println(6);
		
	}
			
			
			
}
