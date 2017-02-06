package feb06;

public class InstanceofTest {
	
	public static void main(String args[]){
		
		FireEngine2 fe = new FireEngine2();
		
		if(fe instanceof FireEngine2){
			
			System.out.println("This is a FireEngine instance.");
		}
		

		if(fe instanceof Car5) {
			System.out.println("This is a Car instance.");
		} 

		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		} 
			
		
				
	}

}

class Car5{}
class FireEngine2 extends Car5{}


/* 결과

This is a FireEngine instance.
This is a Car instance.
This is an Object instance.



*/



/* 참고


자바의 구조는 Object로 이뤄져 있다.

b = new B(); 

이와 같은 형태를 인스턴스화 한다.
이처럼 인스턴스화 된 변수가 해당 객체에 포함되는지 확인하기 위해
instanceOf를 사용합니다.


*/