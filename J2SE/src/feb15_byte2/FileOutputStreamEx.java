package feb15_byte2;

import java.io.*;

public class FileOutputStreamEx {
	
	public static void main(String arg[]) throws FileNotFoundException,IOException{
		
		
		FileOutputStream fos = null;
		
		try{
			//fos = new FileOutputStream("C:\\io\\fileout.txt");  // 덮어 쓰기
			fos = new FileOutputStream("C:\\io\\fileout.txt",true);  // 이어쓰기
			
			String message = "Hello fileOutputStream!!";
			fos.write(message.getBytes());
			
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();			
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(fos != null) fos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
				
			}
		}
		
		
	}

}
