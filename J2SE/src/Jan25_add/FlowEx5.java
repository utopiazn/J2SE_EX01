package Jan25_add;

public class FlowEx5 {
	
	public static void main(String[] args){
		
		int score = 98;
		String grade = ""; // 두 문자를 저장할 것이므로 변수의 타입을 String으로 함.
		
		System.out.println("당신의 점수는 " + score + "입니다");
		
		if(score >= 90){
			grade = "A";           // score가 90점 보다 같거나 크면 A학점
		
			if(score >= 98){  //  스코어가 98접 이상이면 A+
				grade += "+";
				
			}else if (score <94){ 
				grade += "-";
			}
		
		}else if(score >= 80){  // 점수가 80보다 작거나 크면 B학점 
			
			grade = "B";
			
			
			if(score >88){
				grade += "+";
			}else if(score <84){
				grade +="-";
			}
			
		}else{
			
			grade = "C";
			
		}
		System.out.println("당신의 점수는 " + grade + "입니다");
	}
		

}
