package feb08;

import static java.lang.System.out;

public class ExceptionEx2 {
	
	public static void main(String[] args){
		
		int[] var = {10,200,30};
		
		for(int i =0; i<=3 ; i++){
			
			try{
				out.println("var["+i+"] : "+var[i]);
			}catch(ArrayIndexOutOfBoundsException ae){
				out.println("베열을 넘었습니다.");
			}
			
			
		}
		
		out.println("프로그램 끝!");
		
	}

}
