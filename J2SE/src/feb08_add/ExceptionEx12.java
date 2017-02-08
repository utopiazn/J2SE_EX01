package feb08_add;

import static java.lang.System.out;

public class ExceptionEx12 {
	
	public static void main(String[] args){
		// 참조변수 ae를 통해, 생성된 ArithmeticException인스턴스에 접근할 수 있다.	
		out.println(1);
		out.println(1);
		
		try{
			out.println(3);
			out.println(0/0);  // 예외발생
			out.println(4);  // 실행되지 않는다.
			
		}catch(ArithmeticException ae){
			
			ae.printStackTrace();
			out.println("예외 메시지 : "+ae.getMessage());
		}
		
		
		out.print(6);
		
	}

}


/*
1
1
3
java.lang.ArithmeticException: / by zero
	at feb08_add.ExceptionEx12.main(ExceptionEx12.java:14)
예외 메시지 : / by zero
6

*/