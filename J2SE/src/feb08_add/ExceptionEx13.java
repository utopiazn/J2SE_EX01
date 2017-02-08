package feb08_add;

import java.io.*;

public class ExceptionEx13 {
	public static void main(String[] args){
		
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		
		try{
			fos = new FileOutputStream("error.log");
			ps = new PrintStream(fos);
			
			System.out.println(1);			
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);	// 예외발생!!!
			System.out.println(4); 		// 실행되지 않는다.
			
		}catch(Exception ae){
			ae.printStackTrace();
			
			// 화면대신 error.log파일에 출력한다
			ps.println("예외메시지 : " + ae.getMessage());
			
		}
		
		System.out.println(6);
		
	}

}
