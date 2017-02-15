package feb15_file;

import java.io.*;
import static java.lang.System.out;

public class FileEx2 {
	
	public static void main(String[] args){
		
		
		
		if(args.length != 1){
			out.println("USAGE : java FileEx2 DIRECTORY");			
		}	System.exit(0);
		
		
		File f = new File(args[0]);
	
		if(!f.exists()|| !f.isDirectory() ){
			out.println("유효 하지 않은 디렉토리 입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		out.println("ddd'");
		
		for(int i =0; i< files.length; i++){
			
			out.println("ddd'");
			String fileName = files[i].getName();
			out.println(files[i].isDirectory() ? "["+fileName+"]" : fileName);
		}
		
		
	}

}
