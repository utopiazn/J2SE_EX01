package feb07_Inner;

public class InnerEx3 {
	
	private int outerlv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerlv; // 외부 클래스의 private멤버도 접근가능하다.
		int iiv2 = outerCv; 
	}
	
	static class StaticInner{
		//static 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
		//int siv =outerlv;
		
		static int scv = outerCv;		
	}
	
	void myMethod(){
		int lv =0;
		final int LV = 0;
		
		class LocalInner{
			int liv =outerlv;
			int liv2 = 2;
			
			//외부 클래스의 지역변수는 final이 붙은 변(상수)만 접근가능하다.
			int liv3 = lv; // 8.0 버전부터는 가능함.
			int liv4 = LV;
			
		}
	}

}


