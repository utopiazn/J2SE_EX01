package jan31;

class Tv2{
	
	// Tv�� �Ӽ�(�������)
	String color = ""; // ����
	boolean power;     // ���� ����(on/off) 
	int channel= 0;    // ä�� :0
	
	// Tv�� ���(�޼ҵ�)
	void power(){
		power = !power;
	}
	
	void channelUp(){
		++channel;
	}
	
	void channelDown(){
		
		if(channel >1)
			--channel;
		else
			System.out.println("ä���� ���̻� ����� �����ϴ�.");
	}
}


public class TvTest2 {
	
	public static void main(String[] args){
		
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();
		
		System.out.println("t1�� channel����"+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel����"+ t2.channel + "�Դϴ�.");
	
		t1.channel = 7; // channel ���� 7���� �Ѵ�.		
		System.out.println("t1�� channel����"+t1.channel +"�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel����" + t1.channel +"�Դϴ�.");
		System.out.println("t2�� channel����" + t2.channel +"�Դϴ�.");
		
		
		
	}

}
