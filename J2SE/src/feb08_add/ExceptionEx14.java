package feb08_add;

import java.io.*;
import java.util.*;


public class ExceptionEx14 {
	
	public static void main(String[] args){
		
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try{
			//error.log 파일에 출력할 준비를 한다.
			fos  = new FileOutputStream("error.log",true);
			
			//err의 출력을 화면이 아닌, error.log파일오 변경한다.
			ps = new PrintStream(fos);
			
			//System.err의 출력에 대한 리다이렉션 //System.err의 출려 대상을 ps객체가 지정하는 위치로 리디렉션한다.
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);  // 예외발생
			System.out.println(4);    // 실행되지 않는다.
			
			
		}catch(Exception e){
			
			System.err.println("-----------------------------------------------");
			
			System.err.println("예외발생시간 : " + new Date());  // 현재시간출력
			e.printStackTrace(System.err);
			System.err.println("예외메시지 : " + e.getMessage());
			
			System.err.println("-----------------------------------------------");
			
			
		}
		
		System.out.println(6);
		
		
	}

}
