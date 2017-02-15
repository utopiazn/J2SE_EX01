package feb15_byte2;

import java.io.*;

public class BufferedInputStreamEx {
	
	public static void main(String[] args){
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try{
			fis = new FileInputStream("C:\\Java\\git\\J2SE_EX01\\J2SE\\src\\feb15_byte2\\FileInputStreamEx.java");
			bis = new BufferedInputStream(fis);
			
			int readbyte =0;
			
			while((readbyte = bis.read())!= -1){
				System.out.print((char)readbyte);
			}
			
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				
				if(fis != null) fis.close();
				if(fis != null) bis.close();
				
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
		
		
	}

}
