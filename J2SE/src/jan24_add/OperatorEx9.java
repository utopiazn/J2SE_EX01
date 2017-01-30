package jan24_add;

public class OperatorEx9 {
	
	public static void main(String[] args)
	{
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b);
		
		System.out.println("a : " + Integer.toBinaryString(a));
		System.out.println("b : " + Integer.toBinaryString(b));
		
		System.out.println("a+b : " + Integer.toBinaryString(a+b));
		System.out.println(c);
		
	}

}
/*
 * 
 * byte	1byte	0	-128 ~ 127


                 1 0 1 0     <-- a : 10
  +           1  1 1 1 0     <-- b : 30 
 -----------------------
          1   0  1 0 0 0     <== a+b = 48
                         
128  64  32  16  8 4 2 1


*/