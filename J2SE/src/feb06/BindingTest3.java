package feb06;

public class BindingTest3 {
	
	public static void main(String[] args){
		
	
		Parent7 p = new Child7();		
		Child7 c = new Child7();

		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
				
		System.out.println("c.x = " + c.x);
		c.method();
		
	}
}

class Parent7{
	
	int x = 100;
	void method(){		
		System.out.println("Parent Method");		
	}	
}

class Child7 extends Parent7{
	
	int x = 200;
	
	void method(){
		System.out.println("x="+x);  // this.x 와 같다.
		System.out.println("super.x=" +super.x);
		System.out.println("this.x"+this.x);
	}
}

/* 결과

p.x = 100
x=200
super.x=100
this.x200

c.x = 200
x=200
super.x=100
this.x200
*/