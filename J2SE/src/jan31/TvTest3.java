package jan31;


class Tv3{
	
	//Tv�� �Ӽ� (�������)
	String color = "";  // ����
	boolean power= false;   // ����
	int channel = 0;
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		++channel;
	}
	
	void channelDown(){
		--channel;
	}
	
	
	
}

public class TvTest3 {

	public static void main(String[] args){
		
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		
		System.out.println("t1�� channel����"+ t1.channel +"�Դϴ�.");
		System.out.println("t2�� channel����"+ t2.channel +"�Դϴ�.");
		
		t2 = t1;   // t2 �� t1 �ּҰ��� ������.
		t1.channel =7;
		System.out.println("t1�� channel����" +t1.channel+ "�Դϴ�");
		
		System.out.println("t1�� channel����" +t1.channel+ "�Դϴ�");
		System.out.println("t2�� channel����" +t2.channel+ "�Դϴ�");				
		
	}
}
