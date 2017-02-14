package feb14;

class SuperThreadPriority extends Thread{
	public SuperThreadPriority(String threadName){
		super(threadName);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		System.out.printf("쓰래드 이름 : %s \n",Thread.currentThread().getName());
	}
	
}


public class PriorityChangeEx  extends SuperThreadPriority {

	public PriorityChangeEx(String threadName) {
		super(threadName);
		// TODO Auto-generated constructor stub		
	}
	
	public static void main(String arg[]){
	
		Thread t1 = new SuperThreadPriority("첫번째 스레드");
		t1.setPriority(1);  // 우선 순위 10~1
		t1.start();
		
		Thread t2 = new SuperThreadPriority("두번째 스레드");
		t2.setPriority(10);  // 우선 순위 10~1
		t2.start();
		
		
		
	}
	

}
