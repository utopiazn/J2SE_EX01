package jan31;

public class MethodEx {

	int var1 ,var2; //멤버변수들
	
	// public Methodex(){} 생성자.
	
	public int sum(int a,int b){ // 멤버메서드
		//접근제한자 리턴타입 메소드명(매개변수1,매개변수2)
		return a+b;
	}
	
	public static void main(String[] args){
		
		//sum(1000, -10)  // 오류 static  영역(stack)과 메서드 영역(heap)이 틀려서  호출 불릉
		
		MethodEx me = new MethodEx();  // 객체를 생성
		int res = me.sum(1000, -10); //메서드 호출 ==>지역변수저장
		System.out.println("res=" + res);
	}
	
	
	
}

/*
 *MethodEx
 *--------------------------------------------------
 *int var1,var2 
 * -----------------------------------------------
 * sum()
 * 
 */
