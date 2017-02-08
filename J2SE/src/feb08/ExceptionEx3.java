package feb08;

import static java.lang.System.out;

public class ExceptionEx3 {
	
	public static void main(String[] args){
		int var = 50;
	
	
		try{
			int data = Integer.parseInt(args[0]);
			
		}catch(NumberFormatException ne){ // 숫자가 아닐때
			out.println("숫자가 아닙니다.");
		}catch(ArithmeticException ae){
			out.println("0으로 나눌순 없죠?");			
		}catch(ArrayIndexOutOfBoundsException ae){
			out.println("배열을 넘었습니다.");			
		}		
		out.println("프로그램 종료");
		
	}

}
