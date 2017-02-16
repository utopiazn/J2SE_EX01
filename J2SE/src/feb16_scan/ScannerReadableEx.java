package feb16_scan;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class ScannerReadableEx {
	
	public static void main(String[] args){
		Scanner scan = null;
		FileReader fr = null;
		
		try{
			fr = new FileReader("C:\\io\\scan.txt");

			//BufferedReader in = new BufferedReader(fr,"UTF8");
			//BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\io\\scan.txt"),"UTF8"));
			
			scan = new Scanner(fr);
			/*
			while(scan.hasNextDouble()){
				out.printf("스캔  : %.2f %n" ,scan.nextDouble());
			}		
			*/
			
			while(scan.hasNext()){ // 한글 깨짐
				System.out.printf("스캔  : %s %n" ,scan.next());
			}
			
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			
			
			try{
				if(fr != null) fr.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			if(scan !=null) scan.close();
			
		}
		
		
	}

}
