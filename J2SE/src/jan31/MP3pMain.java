package jan31;

public class MP3pMain {

	
	static void Mp3pSetting(MP3p m3,String color,int memory){
		
		
		
		m3.setColor(color);
		m3.memoryUp(memory);
		
		System.out.println(m3.color);
		System.out.println(m3.memory);
		
		
	}
	
	
	
	public static void main(String[] a){
		
		//MP3p m3; //객체를 선언
		//m3 = new MP3p(); // 객체를 생성
		
		MP3p m3 = new MP3p();	
		
		Mp3pSetting(m3,"RED",10240);
		
		
		
	//	m3.setColor("RED");
	//	m3.memoryUp(10240);		
	//	System.out.println(m3.color);
	//	System.out.println(m3.memory);
		
	}
}
