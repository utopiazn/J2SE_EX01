package Jan25_add;

import java.io.IOException;


public class FlowEx24 {
	
	public static void main(String[] args) throws java.io.EOFException{  // input , output 예외 처리
		
		int input =0;
		
		System.out.println("문장을 입력하세요.");
		System.out.println("입력을 마치면 x를 입력하세요");

		
		do {
			
			try {
				input = System.in.read();
				
				
				
				
				//System.out.print((char)input);
				
			} catch (IOException e) {
				// TODO Auto-generated catch blockd
				e.printStackTrace();
			}
			System.out.print((char)input);
			
			
			System.out.println("");
			
		} while(input != -1 && input !='x');
			
		
	
		
		
		
	}

}
