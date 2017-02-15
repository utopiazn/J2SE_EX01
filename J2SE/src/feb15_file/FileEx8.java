package feb15_file;

import java.io.*;
import java.util.*;

public class FileEx8 {
	static int deltedFiles =0;
	
	public static void main(String[] args){
		
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx8 Extension");
			System.exit(0);
		}

		
		String currDir = System.getProperty("user.dir");
		
		File dir = new File(currDir);
		String ext = "."+ args[0];
		
		System.out.println(ext);
		
		delete(dir,ext);
		
		System.out.println(deltedFiles +"개의 파일이 삭제 되었습니다." );
		
		
		
	}
	
	public static void delete(File dir,String ext){
	
		File[] files = dir.listFiles();
		
		for(int i =0; i<files.length; i++){
			
			if(files[i].isDirectory()){
				delete(files[i],ext);
			}else{
				
				String  filename = files[i].getAbsolutePath();
				
				if(filename.endsWith(ext)){
					
					System.out.print(filename);
					
					if(files[i].delete()){
						System.out.println(" - 삭제 성공");
					}else{
						System.out.println(" - 삭제 실패");
					}
				}
				
				
			}
			
			
		}
		
		
	}

}
