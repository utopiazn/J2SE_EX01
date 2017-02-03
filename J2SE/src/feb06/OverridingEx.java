package feb06;

class Parent{
	String msg = "Parent 클래스";
	
	public String getMsg(){
		return msg;
	}
	
	public String getMsg2(){
		return msg;
	}
}

class Child extends Parent{    
	String msg = "Childz크래스";
	public String getMsg(){ // 오버라이딩
		
		return msg;
	}	
}

public class OverridingEx {
	
	public static void main(String[] args){
		
		Child cd = new Child();
		System.out.println("cd : "+cd.getMsg()); // Child 클래스		
		//추상클래스,인터페이스
		
		
		// 오버라이딩 된 상황에서는 똑같은 함수가 있을경우 new Child() 의 함수가 우선 실행됨.
		Parent pt = new Child(); //처음보는 객체생성 (부모클래스 객체명 = new 자식클래스())
		System.out.println("pt : "+pt.getMsg()); //childt 클래스
		
		
		
		
		//Child cc = new Parent();
		Parent ct = new Parent();
		System.out.println("cd : "+ct.getMsg()); //parent클래스
	}

}
