package feb08_add;

public class ExceptionEx6 {
	
	public static void main(String[] args){
		
		
		try{
			
			Exception e = new Exception("고의로 발생시켰음!");
			throw e; // 에러 발생시김
			
			//throw new Exception("고의로 발생시켰음"); // 위의 두줄로 사용가능
			
			
		}catch(Exception e){
			
			System.out.println("에러 메시지"+e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램이 정상 종료되었음.");
		
		
	}

	
}
/*
에러 메시지고의로 발생시켰음
프로그램이 정상 종료되었음.
java.lang.Exception: 고의로 발생시켰음
	at feb08_add.ExceptionEx6.main(ExceptionEx6.java:10)


*/