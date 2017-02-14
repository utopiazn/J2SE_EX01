package feb14;

import static java.lang.System.out;

class MyRunnableTwo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		out.println("run");
		frist();
	}
	
	public void frist(){
		out.println("furst");
		second();
	}
	
	public void second(){
		out.println("second");
	}
	
}



public class JoinEx {

	public static void main(String[] args){
		
		out.println(Thread.currentThread().getName()+" start");
		
		Runnable r = new MyRunnableTwo();
		Thread myThread = new Thread(r);
		
		myThread.start();
		
		try{
			myThread.join();  // myThread.start(); 를 실행 시킴
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		out.println(Thread.currentThread().getName()+"end");
		
		
		
	}
	
}

/*
main start
run
furst
second
mainend

 
 */
