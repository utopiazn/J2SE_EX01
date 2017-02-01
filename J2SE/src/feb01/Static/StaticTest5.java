package feb01.Static;

public class StaticTest5 {
	int a = 100;
	static int b = 200;
	static{
		b = 5000;
		c= 10000;
	}
	
	//d = 10000;
	public static void main(String[] args){
		
		System.out.println(c);  // static 동일 영역에 있어서 바로 가져다 씀.
		
	}
	
	
	
	static int c;  // static 영역은  변수를 선언을 나중에 해줘도 문제가 없음
				   // static 영역을 다 생성한후  오류가 체크 되는것으로 파악됨.
}
