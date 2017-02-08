package feb08_add;

public class ExceptionEx20 {
	
	public static void main(String[] args){
		
		try{
			method1();
		}catch(Exception e){
			
			System.out.println("main메서드에서 예외가 처리되엇습니다.");
			e.printStackTrace();
		}
		
		
	}
	
	static void method1() throws Exception{
		
		throw new Exception();		
	}

}


/*결과
main메서드에서 예외가 처리되엇습니다.
java.lang.Exception
	at feb08_add.ExceptionEx20.method1(ExceptionEx20.java:20)
	at feb08_add.ExceptionEx20.main(ExceptionEx20.java:8)

 */
