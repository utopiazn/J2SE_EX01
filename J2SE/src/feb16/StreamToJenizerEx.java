package feb16;

import java.io.*;

public class StreamToJenizerEx {
	
	public static void main(String[] args){
		BufferedReader br = null;
		StreamTokenizer st = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try{
			fw = new FileWriter("C:\\io\\streamToken.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			pw.println(10000);
			pw.println("안녕하세요");
			pw.println("utopiazn@naver.com");
			pw.println("I am boy");
			pw.println("~'!@#");
			
			br = new BufferedReader(new FileReader("C:\\io\\streamToken.txt"));
			
			st = new StreamTokenizer(br);
			
			while(st.nextToken() != StreamTokenizer.TT_EOL){
				
			
				switch(st.ttype){
				
				case StreamTokenizer.TT_WORD:
					System.out.println("Word=>"+ st.sval);
					break;
				case StreamTokenizer.TT_NUMBER:
					System.out.println("Number =>"+(int)st.nval);
					break;
				default:
					System.out.println("No word, No number =>"
							+ (char) st.ttype);
					break;
				}
					
				
			}
			
			
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			
			try{
				if(fw != null) fw.close();
				if(fw != null) bw.close();
				if(fw != null) pw.close();
				if(fw != null) br.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			
		}
	
	
	
	}	

}
