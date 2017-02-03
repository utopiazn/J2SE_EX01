package feb06;

public class BindingTest {
	
	public static void main(String[] args){
		Parent5 p = new Child5();
		Child5 c = new Child5();
		
		System.out.println("p.x = "+ p.x);
		p.method();  //100
		
		System.out.println("c.x = " + c.x);
		c.method(); //200
	}

}


class Parent5{
	int x = 100;
	
	void method(){
		
		System.out.println("Parent Method");
	}
	
	
}

class Child5 extends Parent5{
	
	int x = 200;
	
	void method(){ // 오버라이딩
		System.out.println("Child Method");
	}
	
}

/*
결과
p.x = 100
Child Method

c.x = 200
Child Method
*/