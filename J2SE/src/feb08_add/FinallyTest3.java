package feb08_add;

public class FinallyTest3 {

	public static void main(String[] args){
		
		// method1은 static메서드 이므로 인스턴스 생성없이 직접 호출이 가능하다.
		FinallyTest3.method1();
		System.out.println("method1()의 수행을 마치고 main 메서드로 돌아왔습니다.");		
	}  // main메서드의 끝
	
	static void method1(){
		
		try{		
			System.out.println("Method1()이 호출되었습니다.");		
			return ;  // 현재 실행중인 메서드를 종료한다.
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("method1의 finally블럭이 싱행되었습니다.");
		}
		
		
		
	}
}


/* 결과.
Method1()이 호출되었습니다.
method1의 finally블럭이 싱행되었습니다.
method1()의 수행을 마치고 ㅡ먀ㅜ 메서드로 돌아왔습니다.
*/