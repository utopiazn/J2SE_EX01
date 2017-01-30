package jan24_add;

public class OperatorEx22 {
	
	public static void printf(String str,int temp){
			
		
		System.out.println(str + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
	}

	public static void main(String[] args){
		
		
		
		int temp; // 계산 결과를 담기 위한 변수

		printf("",-8);
		
	
		temp = -8 <<1;
		printf("-8 << 1 =",temp);
	
		temp = -8 <<2;
		printf("-8 << 2 =",temp);
		
	
		temp = -8 >>1;
		printf("-8 >> 1 =",temp);		
		
		temp = -8 >>2;
		printf("-8 >> 2 =",temp);
	
		temp = -8 >>2;
		printf("-8 >> 2 =",temp);
		
		
		printf("",-8);
		
		temp = -8 >>> 1;
		printf("-8 >>> 1 =",temp);
	
		
		temp = -8 >>> 2;
		printf("-8 >>> 2 =",temp);
	
		
		
	}
}




/* Byte의 숫자 표현
 * 
 * 0000 0000 : 0
 * 0000 0001 : 1
 * 
 * 0111 1111 : 127
 * 1000 0000 : -128
 * ....
 * 1111 1110 : -2 
 * 1111 1111 : -1 
 * ++시키면 0
 * 
 * byte a = 127;
 * a++;
 * a를 출력하면? - 128이다
 * 
 
 */
