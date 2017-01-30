package jan24;

public class IntEx3 {

	public static void main(String[] args){
		
		byte var1 = (byte)128;  // 오류
		short var2 = (short)32000L;	
		int  var3 = (int)550f;
		
		
		System.out.println("var1 의 값은"+ var1);
		System.out.println("var2의 값은"+ var2);
		System.out.println("var3의 값은"+ var3);
	
		
	}
	
}
