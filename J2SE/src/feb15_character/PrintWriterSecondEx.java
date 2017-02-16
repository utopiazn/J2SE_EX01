package feb15_character;

import java.io.*;


public class PrintWriterSecondEx {

	public static void main(String args[]){
		
		PrintWriter pw = null;				
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try{
			fos = new FileOutputStream("C:\\io\\printWriterSecond.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos,true);
			pw.println("안녕하세요!!");
			pw.println("또 만났네요");
			pw.println(100.0);
			pw.println(new Boolean(true));
			
			
		}catch(IOException io){
			io.printStackTrace();
		}finally{
			try{
				if(fos !=null) fos.close();
				if(pw !=null) pw.close();
				if(bos !=null) bos.close();
				
			}catch(IOException ioe){
				ioe.printStackTrace();
				
			}
		}
		
	}
	
}
