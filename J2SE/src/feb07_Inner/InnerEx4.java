package feb07_Inner;

class Outer{
	class InstamceInner{
		int iv = 100;		
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv=300;
	}
	
	void myMethod(){
		class LocalInner{
			int iv = 400;
		}
	}
	
}


public class InnerEx4 {
	
	public static void main(String[] args){
		// 인스턴스클래스의 인스턴스를 생성하면
		// 외부 크랠스이 인스턴스를 먼저 생성해야한다.
		Outer oc = new Outer();
		Outer.InstamceInner ii = oc.new InstamceInner();
		
		System.out.println("ii.vi :" + ii.iv);
		System.out.println("Outer.StaticInner.cv :"+Outer.StaticInner.cv);

		// static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.vi : "+ si.iv);
		
	}

}

/*
ii.vi :100
Outer.StaticInner.cv :300
si.vi : 200
 
 
 
 */
