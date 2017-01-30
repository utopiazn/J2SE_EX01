package jan24_add;

public class OperatorEx6 {

	public static void main(String[] args){
		
		byte b = 10;
		//byte result = ~b;
		byte result = (byte)~b;
		
		System.out.println("b = " +b );
		System.out.println("~b ="+ result);
	}
}

// 정수형
// byte	1byte	0	-128 ~ 127