package feb02;

public class StringEx2 {

	public static void main(String[] args){
		
		String s1 = "I ♥ YOU";
		
		// s1의 영역과     "Yun-A";의 서로 다른 영역이 합처져서 s1에 들어감. 
		s1 = s1 + "Yun-A";
		System.out.printf("s1 : %s",s1);
		
	}
	
}
