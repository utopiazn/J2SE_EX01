package feb06;

class A{
	public void methodA(B b){
		b.methodB();
	}
}

class B{
	public void methodB(){
		System.out.println("methodb()");
	}
}

public class InterfaceTest {
	public static void main(String args[]){
		
		
		
		A a = new A();
		B b = new B();
		a.methodA(b);
		
		new A().methodA(new B());
		
		
	}


}
