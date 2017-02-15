package feb15_file;

import java.io.*;
import static java.lang.System.out;

public class FileEx9 {
	
	public static void main(String[] args){
		
		if (args.length != 1) { 
			  System.out.println("Usage: java FileEx9 DIRECTORY"); 
			  System.exit(0); 
		} 
		
		File dir = new File(args[0]);
		
		
		if(!dir.exists() || !dir.isDirectory() ){
			out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
			
		}
		
		File[] list = dir.listFiles();
		
		for(int i =0; i<list.length; i++){
			
			String fileName = list[i].getName();
			// 파일명    0000TestEx.java
			
			String newFileName = " 0000" + fileName;
			newFileName = newFileName.substring(newFileName.length(), -7);
			
			list[i].renameTo(new File(newFileName));
			
			
		}
		
		
	}
			
			
			
			
			
			

}
