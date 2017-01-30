package jan24;

public class IntEx1 {
	
	public static byte gbyte;
	
	public static void main(String[] args)
	{
		
		//byte  = 1byte  기본값:0    -128 ~127
		
		byte var1 = (byte)129; // 손실
		
		byte var2 = (byte)127; // 솔실 없음.
		
		
		//byte var3;  // 로컬 변수는 초기화 해야함.
		

		System.out.println("var1의값: " +  var1);
		

		System.out.println("var2의값: " +  var2);
		
		System.out.println("전역 변수 gbyte의값: " +  gbyte);  // 기본값 확인
		
		//System.out.println("var3의값: " +  var3);
		
		
	}

}
