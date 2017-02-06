package feb06;

class Card4{
	
	final int NUMBER;  //상수지만 선과 한게 초기화 하지 않고
	final String KIND; //생성자에서 단 한번만 초기화 할수 잇다.
	static int width = 100;
	static int height = 250;
	
	public Card4(String kind,int unm) {
		// TODO Auto-generated constructor stub
		KIND = kind;
		NUMBER = unm;
		
	}
	
	
	Card4(){
		this("HEART",1);
	}
	
	public String toString(){
		return "" +KIND + " " +NUMBER;
	}
	
}

public class FinalCardTest {
	
	public static void main(String[] args){
		
		Card4 c = new Card4("HEART",10);
		//c.NUMBER = 5;	// 에러!!! cannot assign a value to final variable NUMBER
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		
		// toString() 는 기본적으로 오브젝트에서 상속 받기때문에 선언이 없어도  호출됨 단 없을 경우 주소값의로 나옴.		
		System.out.println(c);  
		
		
	}

}


/* 결과
HEART
10
HEART 10


 */
