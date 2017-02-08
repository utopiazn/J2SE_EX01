package feb08_add;

import static java.lang.System.out;

public class ExceptionEx5 {
	
	
	//0으로 나누어서 고의로 ArithmeticException을 발생시킨다.
	public static void main(String[] args){
		out.println(1);
		out.println(2);
		
		try{
			out.println(3);
			out.println(0/0);
			out.println(4);
			
		}catch(Exception e){
			out.println(5);
		}
		
		
		out.println(6);
		
	}

}
/*결과

1
2
3
5
6

*/