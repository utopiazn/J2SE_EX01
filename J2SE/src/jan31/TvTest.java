package jan31;

class Tv1 {
	
	String color="";   		 // ����  defult :null 	
	boolean power = false;   // ����  defult :false 
	int channel = 0; 		 // ä��  defult :0
	
	
	
	void Power(){  			// Tv�� �Ѱų� ���� ����� �ϴ� �޼ҵ�
 		
		power = !power;
	}
	
	void channelUp(){ 		// TV ä���� ���̴� ����� �ϴ� �޼ҵ�
		++channel;
	}
	
	void channelDown(){  	// TV�� ä���� ���ߴ� ����� �ϴ� �޼���
		--channel;
	}
	
	
}


public class TvTest {
	
	public static void main(String args[]){
		
		
		Tv1 t;   // Tv �ν������� �����ϱ� ���� ���� t�� ���� // t�� Tv1�� �ּ� ��.
		
		t = new Tv1();     // TV�ν������� �����Ѵ�.
		t.channel = 7;     // TV�ν������� ������� channel�� ���� 7�� �Ѵ�.
		t.channelDown();   // Tv �ν��Ͻ��� �޼ҵ� channelDown()�� ȣ���Ѵ�.
		
		System.out.println("���� ä����" + t.channel + "�Դϴ�.");
		
		
		
	}

}
