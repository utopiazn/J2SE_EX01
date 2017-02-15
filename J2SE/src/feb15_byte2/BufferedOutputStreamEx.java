package feb15_byte2;


import java.io.*;

public class BufferedOutputStreamEx {

	public static void main(String[] args){
		
		FileOutputStream fos = null;		
		BufferedOutputStream bos = null;
		
		try{
			fos = new FileOutputStream("C:\\io\\bufferOut.txt");
			bos = new BufferedOutputStream(fos);
			
			String str = "BufferedOutpustStream Test 입니다.";
			bos.write(str.getBytes());
			bos.flush();
			
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			
			try{
				if(fos != null) fos.close();
				if(fos != null) bos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			
			
		}
		
	}
	
	
}
