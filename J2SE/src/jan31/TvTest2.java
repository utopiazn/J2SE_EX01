package jan31;

class Tv2{
	
	// Tv의 속성(멤버변수)
	String color = ""; // 색상
	boolean power;     // 전원 상태(on/off) 
	int channel= 0;    // 채널 :0
	
	// Tv의 기능(메소드)
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
			System.out.println("채널을 더이상 낮출수 없습니다.");
	}
}


public class TvTest2 {
	
	public static void main(String[] args){
		
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();
		
		System.out.println("t1의 channel값은"+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은"+ t2.channel + "입니다.");
	
		t1.channel = 7; // channel 값을 7으로 한다.		
		System.out.println("t1의 channel값은"+t1.channel +"로 변경하였습니다.");
		
		System.out.println("t1의 channel값은" + t1.channel +"입니다.");
		System.out.println("t2의 channel값은" + t2.channel +"입니다.");
		
		
		
	}

}
