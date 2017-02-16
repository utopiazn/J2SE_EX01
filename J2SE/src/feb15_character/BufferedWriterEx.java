package feb15_character;
import java.io.*;
public class BufferedWriterEx {

	public static void main(String[] args){
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try{
			fw = new FileWriter("C:\\io\\bufferWriter.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("BufferedWriter 테스트입니다.");
			bw.newLine();
			bw.write("안녕하세요"+ System.getProperty("line.separator"));
			
			
			bw.flush();
			
			
		}catch(IOException ie){			
			ie.printStackTrace();
		}finally{
			
			try{
				if(fw != null) fw.close();
				if(bw != null) bw.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			
		}
		
	}
}
