package feb14_add;

public class ThreadEx13 {
	static long startTime = 0;
	
	public static void main(String args[]){
		
		ThreadEx13_1 th1 = new ThreadEx13_1();
		ThreadEx13_2 th2 = new ThreadEx13_2();
		
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try{
			th1.join(); // th1의 작업이 끝날때  기다린다.
			th2.join(); // th2의 작업이 끝날때까지 기다린다.
		}catch(InterruptedException e){}
		
		System.out.print("소요시간:"+(System.currentTimeMillis() - ThreadEx13.startTime));
	}

}


class ThreadEx13_1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i=0;i<300;i++){
			System.out.print("-");
		}
	}
	
}
class ThreadEx13_2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		for(int i=0; i <300 ;i++){
			System.out.print("|");
		}
	}
	
}