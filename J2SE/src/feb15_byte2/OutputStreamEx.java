package feb15_byte2;

import java.io.*;

public class OutputStreamEx {
	
	public static void main(String args[]){
		
		PrintStream ps = null;
		OutputStream out = null;
		
		try{
			
			ps = System.out;
			out = (OutputStream)ps;
			int first = 'A';
			int second = 'b';
			int dd  = '\n';
			out.write(first);
		
			out.write(dd);
			out.write(dd);
			
			out.write(second);
			out.flush();
			
		
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			
			try{
				if(ps != null) ps.close();
				if(out != null) out.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			
		}
		
		
	}

}
