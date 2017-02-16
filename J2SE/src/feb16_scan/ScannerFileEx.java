package feb16_scan;

import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class ScannerFileEx {

	
	public static void main(String[] args){
		
		Scanner scan = null;
		
		try {
			scan = new Scanner(new File("C:\\io\\scan.txt"));
			
			// 한글이 있을시 오류
		/*	while(scan.hasNextDouble()){
				out.printf("스캔  : %.2f %n" ,scan.nextDouble());
			}
			*/
			while(scan.hasNext()){
				out.printf("스캔  : %s %n" ,scan.next());
			}
			
			scan.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(scan != null)
				scan.close();
		}
		
		
	}
	
}
