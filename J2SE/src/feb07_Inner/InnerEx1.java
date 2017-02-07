package feb07_Inner;

public class InnerEx1 {
	
	class InstanceInner{
		int iv = 1000;
		//static int cv = 100;  // 에러 static  변수를 선언할수 없다.
		final static int CONST = 100; // static final은 상수이므로 허용한다.
		
	}
	
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;  // static 클래스만 stataic 멤버를 정의할수 있다.
	}
	
	
	void myMethod(){
		class LocalInner{
			int iv = 300;
			//static int cv = 300; // 에러! static 변수를 선언할수 없다.
			final static int CONST = 300; // static final은 상수이므로 허용
		}
	}
	
	public static void main(String[] args){
		
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		
		
		
		
	}

}
/* 결과
100
200

*/