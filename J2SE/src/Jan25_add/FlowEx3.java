package Jan25_add;

public class FlowEx3 {
	
	
	public static void main(String[] args){
		
		int score = Integer.parseInt(args[0]);
		char grade =' '; // 학점을 저장하기 위한 변수. 공백으로 초기화 한다
		
		if(score >=90){ //90점 보다 크거나 같을 경우 A학점.
			
			grade = 'A';
		}else if(score >= 80){  // 80점보다 크거나 같을경우 B학점
			grade = 'B';
		}else{ // 나머지는 c학점
			grade = 'C';
		}
		
		System.out.println("당신의 학접은 "+  grade + "입니다.");
	}

}
