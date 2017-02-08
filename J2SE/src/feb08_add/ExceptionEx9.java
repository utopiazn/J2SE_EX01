package feb08_add;

public class ExceptionEx9 {
	
	public static void main(String[] args){
		
		throw new RuntimeException(); // RuntimeException을 강제로 발생시킨다.
	}

}

/* 결과
Exception in thread "main" java.lang.RuntimeException
	at feb08_add.ExceptionEx9.main(ExceptionEx9.java:7)


*/