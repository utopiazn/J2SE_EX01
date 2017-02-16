package feb15_character;
import java.io.*;
public class FileWriterEx {

	public static void main(String[] args){
		
		FileWriter fw = null;
		
		try{
			//fw = new FileWriter("C:\\io\\fileWriter.txt");
			fw = new FileWriter("C:\\io\\fileWriter.txt",true);
			String message = "안녕하세요 FileWriter 테스트";
			fw.write(message);
			
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(fw != null) fw.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
		
		
	}
}
