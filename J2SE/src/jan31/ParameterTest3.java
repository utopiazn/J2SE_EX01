package jan31;

public class ParameterTest3 {
	public static void main(String[] args){
		
		int[] x = {10}; // ũ�Ⱑ 1�� �迭.   x[0] = 10;
		System.out.println("main() : x = "+ x[0]);//10
		
		change(x);
		System.out.println("After change(X)");
		System.out.println(""+ x[0]);//1000
		
		
	}
	
	static void change(int[] x){  // ������ �Ű� ����
		
		x[0] = 10000;
		System.out.println("change() : x = "+ x[0]); //1000
		
	}

}
