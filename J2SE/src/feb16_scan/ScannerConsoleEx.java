package feb16_scan;

import java.util.*;
import static java.lang.System.out;
public class ScannerConsoleEx {

	public static void main(String[] args){
		
		out.print("입력:");
		
		Scanner scan = new Scanner(System.in);	
		
		 
	
		//int number = scan.nextInt(); //문자를 입력시 오류 발생
		String number = scan.next();
		
		out.printf("스캔 : %s", number);
		scan.close();
	}
}
