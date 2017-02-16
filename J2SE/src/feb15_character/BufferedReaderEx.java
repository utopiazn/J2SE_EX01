package feb15_character;

import java.io.*;

public class BufferedReaderEx {

	public static void main(String[] args){
		
		FileReader fr = null;
		BufferedReader br = null;	
		
		try{
			
			
			
			fr = new FileReader("C:\\Java\\git\\J2SE_EX01\\J2SE\\src\\feb15_character\\BufferedReaderEx.java");
			br = new BufferedReader(fr);
			String msg;
			while( (msg = br.readLine()) != null){
				System.out.println(msg);
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
		}
		
		
	}
}
