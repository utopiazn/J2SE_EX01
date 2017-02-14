package feb14_add;

public class ThreadEx3 {

	public static void main(String args[]) throws Exception{
		
		MyThreadEx3_1 t1 = new MyThreadEx3_1();
		t1.run();  // 실제로는 직접적으로 호출하지 않는다 테스트 용으로 사용함.
		
	}
	
}

class MyThreadEx3_1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		try{
			throw new Exception();
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
}

/*결과

java.lang.Exception
	at feb14_add.MyThreadEx3_1.run(ThreadEx3.java:22)
	at feb14_add.ThreadEx3.main(ThreadEx3.java:8)

*/