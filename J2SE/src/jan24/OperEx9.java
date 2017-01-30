package jan24;

public class OperEx9 {
	public static void main(String[] args){
		
		int a = 10;
		int b= 15;
		String s = "크다";
		
		s += (++a >= b) ? (a-b) + "만큼 a가.." : (b-a) + "만큼 b가..";
		// s=   s + (++a >= b) ? (a-b) + "만큼 a가.." : (b-a) + "만큼 b가..";	
		/*
		 11 >= 15 이면  ?     
			(a-b) + "만큼 a가..(참일 경우)
			(b-a) + "만큼 b가.. (거짓이면)		
		
			
 		*/
		System.out.println(s);
		
		
	}
}
