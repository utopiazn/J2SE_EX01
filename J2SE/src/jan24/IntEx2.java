package jan24;

public class IntEx2 {
	public static void main(String[] args){
		
		byte var1 = 127;
		int var2 = (int)550L; // float타입 변수값에는 f/f 를 붙인가
							  // long타입변수값에는 1/L을 붙인가.
		
		
		int var3 = (int)(long)(int)550;
		
		System.out.println("va1의 값 " + var1);
		System.out.println("var2의 값 " + var2);
		
		System.out.println("var3의 값 " + var3);
		
	}

}
