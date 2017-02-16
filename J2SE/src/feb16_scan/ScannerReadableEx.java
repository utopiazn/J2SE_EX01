package feb16_scan;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class ScannerReadableEx {
	
	public static void main(String[] args){
		Scanner scan = null;
		FileReader fr = null;
		
		BufferedReader br = null;
		
		
		try{
			fr = new FileReader("C:\\io\\scan.txt");
			
					
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\io\\scan.txt"),"MS949"));  // 텍스트 파일
			
			
			//scan = new Scanner(fr); //한글 개짐
			scan = new Scanner(br); //수정함.
		
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
				if(br != null) br.close();
				
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			if(scan !=null) scan.close();
			
		}
		
		
	}

}
