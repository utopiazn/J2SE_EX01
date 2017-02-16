package feb15_character;


import java.io.*;

public class FileReaderEx {
	
	public static void main(String[] args){
		FileReader fr = null;
		
		try{
			fr = new FileReader("C:\\Java\\git\\J2SE_EX01\\J2SE\\src\\feb15_character\\FileReaderEx.java");
			int readChar;
			
			
			while((readChar = fr.read()) != -1){
				System.out.print((char)readChar);
			}
			/*
			
			
			//read(char[] cbuf) 메서드 사용
			char[] cbuf = new char[1000];
			int totalReadCount = fr.read(cbuf);
			System.out.println("totalReaderCount :"+ totalReadCount );
			*/
			
			//read(char[] cbuf, int start,int length)
			
			/*
			
			char[] b = new char[5000];
			int totalReadCount = fr.read(b, 10, 3000);
			System.out.println(new String(b));
			System.out.println("totalReaderCount :"+ totalReadCount);
			
			*/
			
			
			
			
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(fr !=null) fr.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}

}
