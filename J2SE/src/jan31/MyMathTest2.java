package jan31;

class MyMath2{
	
	long a,b;
	
	// 인스턴스 변 a,b만을 이용해서 작업하므로 매개 변수가 필요없다.
	long add(){
		return a+b;
	}
	long subtract(){
		return a-b;
	}
	
	long multiply(){
		return a*b;
	}
	
	double divide(){
		return (a/b);
	}
	
	
	// 인스턴스변수와 관계없이 매개 변수만으로 작업이 가능하다.
	
	static long add(long a, long b){
		return (a+b);		
	}
	
	static long subtract(long a,long b){
		return (a-b);
	}
	
	static long multiply(long a,long b){
		return (a*b);
	}
	
	static double divide(double a, double b){
		return (a/b);
	}
	
}


public class MyMathTest2 {
	
	
	
	
	public static void main(String args[]){
		
		long a = 200L;
		long b = 100L;
		
		
		//클래스 메서드 호출
		System.out.println(MyMath2.add(a, b));
		System.out.println(MyMath2.subtract(a, b));
		System.out.println(MyMath2.multiply(a, b));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		System.out.println("------------------------------------------------");
		
		
		MyMath2 mm = new MyMath2();
		
		mm.a = a;
		mm.b = b;
		
		// 인스턴스 메서드는 객체 생성 후에만 호출이 가능함.	
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
		
			
	}

}
