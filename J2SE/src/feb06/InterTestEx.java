package feb06;

interface InterTest{
	static final int a = 100;
	abstract int getA();  
}



public class InterTestEx implements InterTest {

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	
	public static void main(String[] args){
		
		InterTestEx it1 = new InterTestEx();
		System.out.println("GetA():"+it1.getA());
		
	}

}

/* 결과

GetA():100


*/

/*
abstract vs interface
인터페이스와 추상 클래스는 서로 비슷한 듯 다른 기능이다. 인터페이스는 클래스가 아닌 인터페이스라는 고유한 형태를 가지고 있는 반면 추상 클래스는 일반적인 클래스다. 또 인터페이스는 구체적인 로직이나 상태를 가지고 있을 수 없고, 추상 클래스는 구체적인 로직이나 상태를 가지고 있을 수 있다.


어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면 그 객체는 반드시 인터페이스의  메소드들을 구현해야 한다
*/