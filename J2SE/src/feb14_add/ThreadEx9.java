package feb14_add;

import static java.lang.System.out;

public class ThreadEx9 {
	
	
	public static void main(String args[]){
		
		ThreadEx9_1 th1 = new ThreadEx9_1();
		ThreadEx9_2 th2 = new ThreadEx9_2();
		
		
		
		// 설정이 없을 경우 기본 5로 설정됨.
		th2.setPriority(10);  // 우선순위

		out.println("Priority of th1(-) : "+ th1.getPriority());
		out.println("Priority of th2(|) :"+ th2.getPriority());
		
		
	}

}

class ThreadEx9_1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		for(int i=0; i < 300; i++) {
			out.print("-");
			for(int x=0; x < 10000000; x++);
		}
		
	}
	
}

class ThreadEx9_2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		for(int i=0; i < 300; i++) {
			System.out.print("|");
			for(int x=0; x < 10000000; x++);
		}
	}
	
}


/*결과
Priority of th1(-) : 5
Priority of th2(|) :10


*/

