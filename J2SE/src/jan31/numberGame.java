package jan31;
import javax.swing.*;  // JoptionPane 클래스를 사용하기 위해서 사용.

public class numberGame {
	
	public static void main(String[] args){
		
		
		// 1~100 사이의 임의의값을 얻어서 answer에 저장한다.		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;    // 사용자입력을 저장한 공간
		String temp = ""; // 사용자 입력을 제장할 임시공가
		int count = 0;    // 시도횟수를 세기위한 변수
		
		
		do{
			
			count++;
			
			temp = JOptionPane.showInputDialog("1~100사이의 숫자를 입력하세요."+ "끝내려면 -1을 입력하세요.");
			
			// 사용자가 취소 버튼을 누르거나 -1을 입력하면 do- while문을 벗어난다.			
			if(temp == null || temp.equals("-1")){				
				break;
			}
			
			System.out.println("입력값 : " + temp);
			
			
			// 사용자입력을 문자열로 받아오기 때문에  int로 변환해 주어야한다.			
			input = Integer.parseInt(temp);
			
			if(answer >  input){
				System.out.println("더 큰 수를 입력하세요.");				
			}else if(answer < input){
				System.out.println("더 작은수를 입력하세요");
			}else{
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번 입니다.");
				break;
			}
			
			
			
			
		}while(true);     // 무한 반복
		
		
		
		
		
	}
	

}
