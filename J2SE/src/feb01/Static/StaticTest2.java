package feb01.Static;


class StaticTest2_1{
	
	String s1 = "static"; //instance
	static String s2 = "STATIC";
	
	public static String getString(){ //static
		
		return s2; // 여기서 만약 s1을 return 하면 오류!
	}
	
}

public class StaticTest2 {
	
	public static void main(String[] args){
		
		// static 는 객체 생성 없이 바로 사용 가능함. 
		System.out.println("s2 :"+StaticTest2_1.getString());
	}

}
