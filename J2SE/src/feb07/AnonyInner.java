package feb07;

interface TestInter{
	int data = 10000;
	public void printData(); // 추상 메서드

	
}

class testinter2 implements TestInter{
	public void printData(){//미완성딘 것을 완성하여  JVM이 가능하도록 해준다
		System.out.println("datta :"+data);
	}
}

public class AnonyInner {
	
	public void test(){
		//추상클래스와 인터페이스가 자생력이 없는 이유는
		//미완성된 자원(추상메서드)이 있으모로
		//JVM이 메모리상에 어떤 형태로 자원을 배치할지
		//모르기 때문이다
		
		//testinter2  선언하지 않았을때
		new TestInter(){
			public void printData(){ // 미완성된것을 완성하여 JVM이 확인가는하도록 해준다.
				System.out.println("data :"+data);
			}
		}.printData();
		
		
		//testinter2 선언 했을때
		testinter2 tt = new testinter2();
		tt.printData();
		
	}

	public static void main(String[] args){
		
		AnonyInner ai = new AnonyInner();
		ai.test(); 
		
		
		 System.out.println("");
		
		new AnonyInner().test(); // 익명으로 수정
		
	}
}


/* 결과
data :10000
datta :10000

data :10000
datta :10000

 */
