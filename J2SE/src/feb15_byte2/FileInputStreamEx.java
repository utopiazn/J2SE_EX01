package feb15_byte2;

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] arg){
		
		
		FileInputStream fis = null;		
		byte _read[] = new byte[1000];
		byte console[] = new byte[100];
		
		
		
		try{
			System.out.println("파일명 : ");
			System.in.read(console);
			
			String file = new String(console).trim();  
			fis = new FileInputStream(file); // 객체 생성
			fis.read(_read,0,_read.length); // 입력된 문자열 _read 가져오기
			
			System.out.println(new String(_read).trim());  //콘솔에 출력
			
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			
			try{
				if(fis != null){
					fis.close();
				}
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			
		}
				
		
		
	}
}
