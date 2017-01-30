package jan24_add;

public class OperatorEx1 {
	
	int a; // 전역변수
	
	public static void main(String args[]){
		
		int i = 5;
		// i++   //    i = i+1;과 값은 의미이다. ++i 로 바꿔 써도 결과는 같다.
		
		System.out.println(i++); //5
		i=5; // 결과를 비교하기 위해 i값을 다시 5로 변경.
		// ++ㅑ; //6		
		System.out.println(++i); //6				
	}	
}
