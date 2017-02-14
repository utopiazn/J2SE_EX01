package feb14_add;

public class ThreadEx2 {
	
	public static void main(String args[]) throws Exception{
		
		MyTheadEx2_1 t1 = new MyTheadEx2_1();
		t1.start();
	}

}


class MyTheadEx2_1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		throwExecption();
	}
	
	
	public void throwExecption(){
		 
		try{
			throw new Exception();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

	
	
	
}


/* 결과

java.lang.Exception
	at feb14_add.MyTheadEx2_1.throwExecption(ThreadEx2.java:28)
	at feb14_add.MyTheadEx2_1.run(ThreadEx2.java:21)

*/