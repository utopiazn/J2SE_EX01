package feb08_add;

public class ExceptionEx2 {
	
	public static void main(String[] args){
		
		int number = 100;
		int result =0;
		
		for(int i =0; i<10; i++){
			
			int  h =(int)(Math.random() *10);
			System.out.println(h);
			
			result = number /h; // 9번째 라인
			System.out.println(result);
		}
		
		
	}

}

/*    0이 나오면 오류발생함.
7
14
6
16
4
25
3
33
4
25
7
14
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at feb08_add.ExceptionEx2.main(ExceptionEx2.java:15)
	
	*/
