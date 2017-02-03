package feb06;

class Parent2{
	
	public Parent2(int a){
		
		System.out.println("Parent 클래스");
	}
	
}

 class SuperEx extends Parent2{
	 
	 public SuperEx(){  //parent()
		super(1); 
		System.out.println("SuperEx 클래스");
	 }
	 
	 public static void main(String[] args){
		 SuperEx se = new SuperEx();
	 }

}

 //Super 클래스의 생성자가 가장 먼저 호출된다.
 //sub클랫의 생성자도 호출된다.,,,
 
 