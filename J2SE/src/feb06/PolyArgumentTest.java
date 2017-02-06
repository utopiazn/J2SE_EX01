package feb06;


class Product3{

	int price;  	// 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스 점수
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); //  // 보너스 점수는 제품가격의 10%
	}
	
}


class Tv6 extends Product3{
	
	Tv6(){
		// 조상 클래스의 생성자 Product(int price) 를 호출한다.
		super(100); //Tv의 가격을 100만원으로 한다.
	}
	
	public String toString(){ // Object클래스의 toString()을 오버라이딩한다.
		return "Tv";
		
	}
	
}

class Computer extends Product3{

	Computer() {
		super(200);
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return "Computer";
	}
}


class Buyer{  // 고객, 물건을 사는 사람
	int money =1000; //소유금액
	int bonusPoint = 0; // 보너스점수
	
	void buy(Product3 p){
		
		//Product3 p1 = new Tv6();
		//Product3 p2 = new Computer();
		
		if(money< p.price){
			System.out.println("작액이 부족하여 물건을 살수 없습니다.");
			return;
			
		}
		
		money -= p.price;			// 가진돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint +=p.bonusPoint;	// 제룸의 보너스 점수를 추가한다.
		System.out.println(p+"을/를 구입하셨습니다.");		
		
	}
	
	
}

public class PolyArgumentTest {
	
	public static void main(String[] args){
		
		Buyer b = new Buyer();
		
		Tv6 tv  = new Tv6();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
				
		System.out.println("현재 남은 돈은 " + b.money+ "만원입니다.");
		System.out.println("현재 보너스점수는 "+ b.bonusPoint + "점입니다.");
		
	}

}
