package jan31;

class MyMath2{
	
	long a,b;
	
	// �ν��Ͻ� �� a,b���� �̿��ؼ� �۾��ϹǷ� �Ű� ������ �ʿ����.
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
	
	
	// �ν��Ͻ������� ������� �Ű� ���������� �۾��� �����ϴ�.
	
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
		
		
		//Ŭ���� �޼��� ȣ��
		System.out.println(MyMath2.add(a, b));
		System.out.println(MyMath2.subtract(a, b));
		System.out.println(MyMath2.multiply(a, b));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		System.out.println("------------------------------------------------");
		
		
		MyMath2 mm = new MyMath2();
		
		mm.a = a;
		mm.b = b;
		
		// �ν��Ͻ� �޼���� ��ü ���� �Ŀ��� ȣ���� ������.	
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
		
			
	}

}
