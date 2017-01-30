package jan24;

public class OperEx7 {
	
	public static void main(String[] args){
		
		int a = 12;
		int b = 2;
		//00001100(128 64 32 16 8 4 2 1)
		//00001100
		//00000011 == 3
		
		int c = a>> b;
		System.out.println("변수 c의 값 :" +c);
		//00001100  (128,64,32,16,8,4,2,1)
		int d =a<<2;
		
		System.out.println("변수 d의 값:"+d);
		
		
		
	}

}


//0    0  1  1 0 0 0 0
//128 64 32 16 8 4 2 1