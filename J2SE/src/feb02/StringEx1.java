package feb02;

public class StringEx1 {
	
	public static void main(String[] arg){
		
		String s1 = "Twinkle";
		String s2 = "Twinkl";
		//System.out.println(s1);
		//System.out.println(s2);
		
		System.out.println(s1+s2);
		
		if(s1 == s2)
			System.out.println("s1 과 s2는 같다");
		else
			System.out.println("s1 과 s2는 같지 않다.");
		
		
		String s3 = new String("Little star");
		String s4 = new String("Little star");
		
		if(s3 == s4)  // 주소 값을 비교함.			
			System.out.println("s3 과 s4는 같다.");
		else
			System.out.println("s3 과 s4는 같지 않다.");
		
	
	}

}
