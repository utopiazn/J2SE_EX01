package jan24_add;

public class OperatorEx26 {
	
	public static void main(String[] args){
		
		int x =3; // 0011
		int y= 5; // 0101
		
		System.out.println("x는 "+x+ " 이고, y는:"+y+"일때");
		
		System.out.println("x|y=" + (x|y)); //0111 7  // 1+1 = 1 , 1+0 = 1 ,0+1 = 1, 0+0 =0
		System.out.println("x&y="+ (x&y));  //0001 1 //  1+1 = 1 , 1+0 = 0 ,0+1 = 0, 0+0 =0
		System.out.println("x ^ y = " + (x^y)); // 0110 6  // 1+1 =0 , 1+0 = 1 ,0+1 = 1, 0+0 =0 
		
		System.out.println("true | false = " + (true|false));  // true
        System.out.println("true & false = " + (true&false));  // false 
        System.out.println("true ^ false = " + (true^false));  // true
		
	}

}
/*
&	비트 단위의AND	
|	비트 단위의OR	
^	XOR(배타적OR)	
*/