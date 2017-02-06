package feb06;

import java.util.Vector;// Vector클래스를 사용하기 위해서 추가해주었다.

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
	}
	
	void refund(Product4 p){
		
		if(item.remove(p)){
			
		}
		
	}
	
	
}

public class PolyArgumentTest3 {
	
	public static void main(String arg[]){
	
		
	}

}
