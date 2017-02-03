package feb06;

public class SuperTest2 {
	public static void main(String args[]){
		
		Child3 c = new Child3();
		c.method();
	}

}

class Parent4{
	int x = 10;	
}

class Child3 extends Parent4{
	int x = 20;
	
	void method(){
		
		
		//자기 자신 호출 
		System.out.println("x="+x); //20   
		System.out.println("this.x="+ this.x); //20
		
		
		// 부모클래스 호출
		System.out.println("super.x"+ super.x); //10
	}
	
}