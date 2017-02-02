package feb02;

public class StringBufEx1 {

	public static void main(String[] args){
		
		int var =0;
		
		//기본으로 16자를 가지고 있음
		StringBuffer sb = new StringBuffer("Sun-Ae"); // 6 +16
		var = sb.capacity();		
		System.out.println("capactiy"+ var); // 22

		var = sb.length(); //6		
		System.out.println("length : " +var);
		
	}
}
