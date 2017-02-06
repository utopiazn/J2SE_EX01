package feb06;

import java.util.Vector;// Vector클래스를 사용하기 위해서 추가해주었다.

class Tv8 extends Product4 {
	Tv8() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer3 extends Product4 {
	Computer3() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio2 extends Product4 {
	Audio2() { super(50); }
	public String toString() { return "Audio"; }
}


class Buyer3{ 		   // 고객, 물건을 사는 사람
	int money = 1000;  // 소유 금액	
	int bonusPoint =0; //보너스 금액
	
	Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector객체
	
	
	void buy(Product4 p){
		if(money<p.price){			
			System.out.println("잔액이 부족하여 문건을 살수 없습니다.");
			return ;
		}	
	
		money -= p.price;			// 가진돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다
		item.add(p);				// 구입한 제품을 Vector에 저장한다.
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	
	void buy(Product4 ... p){
		
		for(Product4 i: p){			
			buy(i);
		}
		
		 summary();
		
		
	}
	
	void refund(Product4 p){ // 구입한 제품을 환불한다.
		
		if(item.remove(p)){ // 제품을 Vector에서 제거한다
			money+=p.price;
			bonusPoint-=p.bonusPoint;
			System.out.println(p+ "을/를 반품하셨습니다.");
			
		}else{
			
			System.out.println("구입하신 제품 증 헤당 제품이 없습니다.");
			
		}
		
		
	}
	

	void refund(Product4 ... p ){ // 구입한 제품을 환불한다.
		
		
		
		for(Product4 i: p){
			
			refund(i);	
			
	
		}
		summary();
		
	}
	
	void summary(){  //구매한 제품에 대한 정보를 요약해서 보여준다
		
		int sum =0; 			// 구입한 물품의 가격합계
		String itemList = ""; 	// 구입한 물품 목록
		
		if(item.isEmpty()) {	 // Vector가 비어있는지 확인한다.
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		//Vector의 i번째에 있는 객체를 얻어 온다.
		for(int i=0; i<item.size();i++) {
			Product4 p = (Product4)item.get(i);	
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		
		
		
	}
	
	
	
	
}

public class PolyArgumentTest3 {
	
	public static void main(String arg[]){
		
		Buyer3 b = new Buyer3();
		Tv8 tv = new Tv8();
		Computer3 com = new Computer3();
		Audio2 audio = new Audio2();
		
	/*	
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		
		
		
		System.out.println();
		b.refund(com);
		b.summary();
		
		*/
		
		 System.out.println();
		b.buy(tv,com,audio);
		 
		 System.out.println();
		b.refund(tv,com);
		
		String name = "1" ;
		int price = 0; 
		System.out.println(((name.hashCode() ^(new Integer(price).hashCode()))));
		
	
		
	}

}
