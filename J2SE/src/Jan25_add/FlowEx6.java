package Jan25_add;

public class FlowEx6 {
	
	public static void main(String[] args){
		
		// Math 클래스의 random() 함수를 이용해소ㅓ 1~10 사이의 값을 얻어 낼 수있다.
		
		int score = (int)(Math.random() * 10) +1;
		
		System.out.println(  Math.random() +"   " +  score);
		
		String str = "";
		
		switch(score*100){
		
			case 100 :
				str = "자전거";
				break;
			case 200 :
				str = "TV";
				break;
			case 300 :
				str = "노트북";
				break;
			case 400 :
				str = "자동차";
				break;
				
			default : 
		
		
		}
		
		if((score*100) ==100 || (score*100) ==200 || (score*100) ==300|| (score*100) ==400){		
			System.out.println("당신의 점수는 "+  score*100  + "이고, 상품은 "+ str +"  입니다." );
		}else{
			
			System.out.println("최송하지만 당신의 점수에 해당 상품이 없습니다." );
		}
		
	}
	
}
