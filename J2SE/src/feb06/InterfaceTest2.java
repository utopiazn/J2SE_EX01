package feb06;



interface I{
	public abstract void play();
}


class A2{
	void autoPlay(I i){
		i.play();
	}
}


class B2 implements I {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play in B class");
		
	}	
}

class C implements I{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play in C class");
	}
	
}


public class InterfaceTest2 {
	public static void main(String[] args){
		
		A2 a = new A2();
		a.autoPlay(new B2());
		a.autoPlay(new C());
		
		System.out.println("\n"); 
		new A2().autoPlay(new B2());
		new A2().autoPlay(new C());
	}

}
/* 결과

play in B class
play in C class


play in B class
play in C class


*/