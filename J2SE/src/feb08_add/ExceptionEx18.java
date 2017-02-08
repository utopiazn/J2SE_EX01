package feb08_add;

public class ExceptionEx18 {
	
	public static void main(String[] args) throws Exception {
	
		
		method1(); // 같은 클래스내의 static맴버이므로 객체생성없이 직접 호출가능.
		// main메서드의 끝	
		
	}
	
	static void method1() throws Exception{
		method2();
	}
	
	static void method2() throws Exception{
		throw new Exception();
	}
	

}


/* 결과

Exception in thread "main" java.lang.Exception
	at feb08_add.ExceptionEx18.method2(ExceptionEx18.java:18)
	at feb08_add.ExceptionEx18.method1(ExceptionEx18.java:14)
	at feb08_add.ExceptionEx18.main(ExceptionEx18.java:8)


*/