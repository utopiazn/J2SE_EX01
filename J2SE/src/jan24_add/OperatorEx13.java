package jan24_add;

public class OperatorEx13 {

	public static void main(String[] args){
		
		char c1 = 'a';   // c1에는 문자 'a' 의 고크 값인 97이 저장된다.
		char c2 = c1;    // c1에 저장된어 있는 갑이 c2 에 저장된다.
		char c3 = ' ';   // c3를 공백으로 초기화 한다.
		
		
		int i = c1+1;      // 'a' +1   -> 97  +1  = 98
		
		c3 = (char)(c1+1); //b
		c2++;  //a 
				
		c2++; //b
		
		System.out.println("i="+i); //98
		System.out.println("c2="+ c2); //c
		System.out.println("c3 ="+c3); //b
		
	}
}


/*

문자형	char	2byte	\u0000	0 ~ 65,535



*/

