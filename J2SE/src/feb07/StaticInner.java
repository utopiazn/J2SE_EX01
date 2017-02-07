package feb07;

public class StaticInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	
	static class Inner{
		// 어쩔수 없이 내부 클래스를 선언해야할 경우가 있다.
		// 그건 바로 내부 클래스 맴버중 하나라도
		//static 멤버가 있을때이다.	
		static int d = 1000;		
	
		public void printData(){
				
			//static  으로 선언 해야만 호출가능
			//System.out.println("int a :"+a);			
			//System.out.println("private int b :"+b);
			
			System.out.println("static int c :" +c);			
		}		
	}
	
	public static void main(String[] args){
		
		//내부일 경우
		System.out.println("내부");
		Inner inner = new Inner();
		inner.printData();
		
		
		// 외부에서 생성하는 것이라고 가정하고....
		System.out.println("\n외부");
		StaticInner.Inner inner2 = new StaticInner.Inner();
		inner2.printData();
		
	}

}


/*  결과

내부
static int c :200

외부
static int c :200



*/