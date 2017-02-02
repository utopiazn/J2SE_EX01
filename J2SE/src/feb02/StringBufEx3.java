package feb02;

public class StringBufEx3 {
	public static void main(String[] args){
		
		StringBuffer sb1 = new StringBuffer("Sun-Ae");
		StringBuffer sb2 = sb1.append(" & Kyung-Ju"); //맨뒤에 추가.
		
		//"Sun-Ae & Kyung-Ju"
		// 0123456		
		
		sb2.insert(6, " & Yun-A");   // index 6에 추가 
		String msg = sb1.toString();
		System.out.println("sb1: " + msg);
		
		
		
		
	}

}
