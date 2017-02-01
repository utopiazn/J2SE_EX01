package feb01;

class MyClass1 {
	
	private String name; // 멤버변수
	
	public MyClass1(){}; // 생성자
	
	public MyClass1(String n){
		name = n;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
}
