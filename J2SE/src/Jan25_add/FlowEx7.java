package Jan25_add;

public class FlowEx7 {
	public static void main(String[] agrs){

		// 'A','B','C','D' 중의 하나를 얻을수 있다.
		char ch = (char) (Math.random() *4 + 'A');
		
		System.out.println(Math.random()+"    " + (int)ch   + "   "  + ch);
		
		int score =0;
		
		switch(ch){
			
			case 'A':
				score = 90;
				break;
			case 'B':
				score = 80;
				break;
			case 'C':
				score = 70;
				break;
			case 'D':
				score = 60;
				break;
			default : 
				break;
			
		}
		
		
		System.out.println("당신의 점수는 "+ score + "점 이상 입니다.");
	}

}
