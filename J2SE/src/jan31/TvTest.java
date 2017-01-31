package jan31;

class Tv1 {
	
	String color="";   		 // 색상  defult :null 	
	boolean power = false;   // 전원  defult :false 
	int channel = 0; 		 // 채널  defult :0
	
	
	
	void Power(){  			// Tv를 켜거나 끄는 기능을 하는 메소드
 		
		power = !power;
	}
	
	void channelUp(){ 		// TV 채널을 높이는 기능을 하는 메소드
		++channel;
	}
	
	void channelDown(){  	// TV의 채널을 낮추는 기능을 하는 메서드
		--channel;
	}
	
	
}


public class TvTest {
	
	public static void main(String args[]){
		
		
		Tv1 t;   // Tv 인스던스를 참조하기 위한 변수 t를 선언 // t는 Tv1의 주소 값.
		
		t = new Tv1();     // TV인스던스를 생성한다.
		t.channel = 7;     // TV인스던스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown();   // Tv 인스턴스의 메소드 channelDown()을 호출한다.
		
		System.out.println("현재 채널은" + t.channel + "입니다.");
		
		
		
	}

}
