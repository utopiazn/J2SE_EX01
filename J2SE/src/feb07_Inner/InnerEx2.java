package feb07_Inner;



public class InnerEx2 {

	class InstanceInner{}
	static class StaticInner{}
	
	//인스턴스 멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	//static 멤버간에는 서로 직접 전근이 가능하다.
	static StaticInner cv = new StaticInner();
	
	
	static void staticMethod(){
		//static멤버는 인스턴스멤버에 직접 접근할수 없다,.
		//InstanceInner obj1 = new InstanceInner();		
		StaticInner obj2 = new StaticInner();	
		
		//굳이 접근하려면 아래와 같이 객체를 생성해야 한다.
		//인스턴스 클래스는 외부 클래스를 먼저 생성해야함 생성할수 있다
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj3 = outer.new InstanceInner();
		
		//한줄로 표현
		InstanceInner obj4  = new InnerEx2().new InstanceInner();
		
	}
	
	void myMethod(){
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	
	void instanceMethod(){
		//인스턴스메서드에서 인스턴스멤버와 static멤버 모두 접근 가능하다.
		InstanceInner obj1 = new InstanceInner();
		StaticInner   obj2 = new StaticInner();
		
		//메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할수 없다.
		//LocalInner lv = new LocalInner();
		
		
		
				
	}
	

}
/*결과
100
200


*/