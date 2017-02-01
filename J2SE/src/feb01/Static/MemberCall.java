package feb01.Static;

class MemberCall {

	int iv= 10; //멤버변수
	static int cv =20; // 클래스 변수	
	
	int iv2 = cv;
	// static int cv2 = vi; // 에러. 클래스변수는 인스턴스 변수를 사용할수 없음.
	static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용가능.
	
	MemberCall mc = new MemberCall();    // ==> mc.vi, mc.cv  멤버변수 클래스변수 사용가능함.
	
	
	
	static void staticMethodl(){
		System.out.println(cv);  // 공용변수라 사용 가능
		//System.out.println(iv)  ; // 클래스 멤버변수라서  불가능.
		
		MemberCall c = new MemberCall();
		System.out.println(c.iv);  // 객체를 생성한 후에야 인스턴스 변수의 참조 가능
	}
	
	
	void instanceMethod1(){
		System.out.println(cv);
		System.out.println(iv); // 인스턴스메서드에서는 인스턴스 별수를 바로 사용가능
	}
	
	static void staticMethod2(){
		
		staticMethodl();
		//instanceMethod1(); // 에러. 클래스메서드에서는 인스턴스메서드를 호출하수 없음
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 인스턴스를 생성한 후에야 호출할수 잇음.
	}
	
	
	void instanceMethod2(){  // 인스턴스메서드에서는 인스턴스 메서드와 클래스 메서드 
		staticMethodl();     // 모두 인스턴스 생성 없이 바로 호출이 가능하다.
		instanceMethod1();
	}
			
	
	
}
