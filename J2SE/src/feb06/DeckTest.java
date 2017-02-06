package feb06;

public class DeckTest {

	public static void main(String[] args){
		
		Deck d = new Deck(); //카드 한벌(Deck)을 만든다
		
		Card c = d.pick(0); // 썩기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c);
		d.shuffle(); // 카드를 섞는다
		c=d.pick(0);  // 썩은 후에 제일 위의 카드를 뽑는다.
		System.out.println(c);
		
	}
}

//Deck 클래스

class Deck{
	final int CARD_NUM = 52; // 카드의 개수
	
	Card c[]  = new Card[CARD_NUM];
	
	Deck(){ // Deck의 카드를 초기화 한다.
		int i =0;
		
		for(int k=Card.KIND_MAX; k>0 ;k--){
			for(int n=1 ; n <Card.NUM_MAX+1;n++){
				c[i++] = new Card(k,n);
			}
		}
		
	}
	
	Card pick(){ // Deck에서 카드 하나를 선택한다.
		
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	Card pick(int index){ // 저장된 위치(index)에 있는 카드 하나를 선택한다.
		
		
		if(0<=index && index <CARD_NUM)
			return c[index];
		else
			return pick();		
	}
	
	void shuffle(){
		
		for(int n=0; n <1000; n++){
			int i = (int)(Math.random()* CARD_NUM);
			Card temp = c[0];
			c[0] = c[i];
			c[i] = temp;
		}
		
	}
	
	
}

// Card 클래스

class Card{
	
	static final int KIND_MAX = 4;  // 카드 무늬의 수
	static final int NUM_MAX  = 13; // 무늬별 카드 수
	
	static final int SPADE 		= 4;
	static final int DIAMOND 	= 3;
	static final int HEART 		= 2;
	static final int CLOVER 	= 1;
	
	int kind;
	int number;
	
	
	Card(int kind,int number){
		this.kind = kind;
		this.number = number;
	}
	
	Card(){
		this(SPADE,1);
	}
	
	
	
	
}
