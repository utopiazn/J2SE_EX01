package jan31;
import javax.swing.*;  // JoptionPane Ŭ������ ����ϱ� ���ؼ� ���.

public class numberGame {
	
	public static void main(String[] args){
		
		
		// 1~100 ������ �����ǰ��� �� answer�� �����Ѵ�.		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;    // ������Է��� ������ ����
		String temp = ""; // ����� �Է��� ������ �ӽð���
		int count = 0;    // �õ�Ƚ���� �������� ����
		
		
		do{
			
			count++;
			
			temp = JOptionPane.showInputDialog("1~100������ ���ڸ� �Է��ϼ���."+ "�������� -1�� �Է��ϼ���.");
			
			// ����ڰ� ��� ��ư�� �����ų� -1�� �Է��ϸ� do- while���� �����.			
			if(temp == null || temp.equals("-1")){				
				break;
			}
			
			System.out.println("�Է°� : " + temp);
			
			
			// ������Է��� ���ڿ��� �޾ƿ��� ������  int�� ��ȯ�� �־���Ѵ�.			
			input = Integer.parseInt(temp);
			
			if(answer >  input){
				System.out.println("�� ū ���� �Է��ϼ���.");				
			}else if(answer < input){
				System.out.println("�� �������� �Է��ϼ���");
			}else{
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"�� �Դϴ�.");
				break;
			}
			
			
			
			
		}while(true);     // ���� �ݺ�
		
		
		
		
		
	}
	

}
