package feb07;

abstract class TestAbst{
	int data = 10000;
	public abstract void printData();
}


public class AnonyInner1 {
	
	TestAbst inn = new TestAbst() {
		
		@Override
		public void printData() { // 미완성된 것을 완성한다.
			// TODO Auto-generated method stub
			System.out.println("data : "+data);
		}
	};
	
	
	public static void main(String[] args){
		
		AnonyInner1 ai = new AnonyInner1();
		ai.inn.printData();
	
		
	}

}

/*  결과

data : 10000

*/