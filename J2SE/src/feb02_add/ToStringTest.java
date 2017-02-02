package feb02_add;

public class ToStringTest {
	
	public static void main(String args[]){
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString()); //toString 메소드는 객체가 가지고 있는 값을 문자열로 만들어서 리턴하는 메소드
		System.out.println(today);
		System.out.println(today.toString()); //toString 메소드는 객체가 가지고 있는 값을 문자열로 만들어서 리턴하는 메소드
		
	}

}


/*  결과
KOREA
KOREA
Thu Feb 02 13:49:48 KST 2017
Thu Feb 02 13:49:48 KST 2017
*/