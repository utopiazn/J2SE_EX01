package feb08_add;

public class ExceptionEx19 {
	
	public static void main(String[] args){
		
		method1(); //같은 클래스내의 static 멤버이므로 객체 생성없이 직접 호출
	//	methold();
		
	}
	
	static void method1(){
		
		try{
			throw new Exception();
			
		}catch(Exception e){
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
		
	}
	

}
