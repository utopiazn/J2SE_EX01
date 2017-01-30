package jan24;

//자바파일의 이름 = 클래스 이름
public class BooleanEx {
	
	
	
	public static boolean gTest;
	
	//가상머신에서 클래스를 실행할대 가장먼저 호출하는 메서드
	public static void main(String[] args){
		
		
		boolean b= true; // 변수 선언방법 : [자로형] [변수명]  = [변수값]			
		System.out.println("변수 b의 값" +  b);		


		System.out.println("\n\n");
		
		
		
		// 테스트

		// 로컬 변수 시 초기 값 설정.
		//int a = 1;		
		// boolean 1bit 기본값(false) :: true 또는 0과 1이 아니다.
		//b= (boolean)a;  // 오류   
		
		//boolean ㅣTest;  // 변수 선언이 없을시. 오류발생,		
		//System.out.println("로콜 변수로 사용했을경우:"  + ㅣTest  + "\n\n");	//오류
		
		
		System.out.println("전역 변수로 사용했을경우:"  + gTest  + "\n\n");	
		
		
		
		//boolean a;
		
		//System.out.println(a);
		
		System.out.println("변수 b의 값" +  b);				
		System.out.println(b);	
				
				
		//System.out.println("변수 b의 값" +(int)b1);
		
	}

}


/*
{}  : 코드의 블럭(영역)을 설정
(): 메서드, 셍상자
[]: 배열
<>: 제네릭
*/