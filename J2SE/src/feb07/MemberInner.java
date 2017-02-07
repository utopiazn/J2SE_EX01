package feb07;

public class MemberInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	class Inner{
		public void printData(){  // 내부 클래스 정의
			
			System.out.println("int a :"+a);
			System.out.println("private int :"+b);
			System.out.println("static int c :"+c);
		}
	}
	
	public static void main(String[] args){
		
		
		
		// 두줄 사용
		MemberInner outer = new MemberInner();
		MemberInner.Inner inner = outer.new Inner();
		
		inner.printData();
		
		System.out.println("");
		
		// 한줄 사용
		MemberInner.Inner inner2 = new MemberInner().new Inner();
		
		inner.printData();
		
	}

}

/*
 * 
int a :10
private int :100
static int c :200

int a :10
private int :100
static int c :200

 * 
 */
