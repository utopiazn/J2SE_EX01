package feb07;

public class LocalInner {
	
	int a = 100; // 멤버 변수
	
	public void innerTest(int k){
		
		int b = 200; // 지역변수
		final int c = k; // 상수
		
		class Inner{
			// Local 내부 클래스는 외부클래스의 멤버 변수와 상수들만 접근이 가능하다.			
			 public void getData(){
				System.out.println("int a :" +a);
				System.out.println("int b :" +b); // local 내부 클래스는 지역 변수를 사용할수 없다
												//단, 8.0버전 부터는 사용가능함.		
				System.out.println("final inc c :" +c);  // 상수 사용
				 
			 }
			
			
		}
		
		
		// 추가  
		new Inner().getData();
		
		System.out.println("");
		
		Inner i = new Inner(); // 메서드내에서 Local 내부 클래스 생성
		i.getData(); // 생성된 reference를 통해 메서드 호출
		
	}

	
	public static void main(String[] args){
		
		LocalInner outer = new LocalInner();
		outer.innerTest(1000); //외부 클래스의 메서드 호출
		
	}
}

/* 결과.
int a :100
int b :200
final inc c :1000

int a :100
int b :200
final inc c :1000
*/