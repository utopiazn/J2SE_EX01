package jan31;

class Data {
	
	int x;
	
	static void change(int x){  // 기본형 매개 변수
		x=1000; //  메서드 안의   변수임   this.x 를 사용할경우 전역 변수임.
		System.out.println("charge() : x = " + x); //1000
	}
		
	
}


public class ParameterTest {
	
	public static void main(String[] args){
	
		Data d = new Data(); // 객체 생성
		
		d.x = 10;
		
		System.out.println("main(): x =" + d.x); // 10
		
		Data.change(d.x);
		System.out.println("After charnge(d.x)");
		System.out.println("main() : x = " + d.x);
		
		
	}

}
