package jan31;


class Tv3{
	
	//Tv의 속성 (멤버변수)
	String color = "";  // 색상
	boolean power= false;   // 전원
	int channel = 0;
	
	
	//Tv의 기능(메서드)
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
		
		//System.out.println("주소값:"+ t1);
		
		System.out.println("t1의 channel값은"+ t1.channel +"입니다.");
		System.out.println("t2의 channel값은"+ t2.channel +"입니다.");
		
		
		//t2.channel= 2;
		//System.out.println("1111111"+ t2.channel +"입니다.");	
		//t2 = null;
		//t2 = new Tv3();
		//System.out.println("22222222::: "+ t2.channel +"입니다.");
		
		t2 = t1;   // t2 에 t1 주소값을 저장함.
		
		
		t1.channel =7;
		System.out.println("t1의 channel값은" +t1.channel+ "입니다");
		
		System.out.println("t1의 channel값은" +t1.channel+ "입니다");
		System.out.println("t2의 channel값은" +t2.channel+ "입니다");				
		
	}
}
