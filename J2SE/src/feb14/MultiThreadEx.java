package feb14;

import static java.lang.System.out;

public class MultiThreadEx implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int first = 0;
		int second =0;
		
		for(int i = 0; i<20; i++){
			
			first++;
			second++;
			
			out.printf("first : %d, ",first);
			out.printf("second: %d, ", second);
			out.printf("스레드 이름 : %s %n",
					Thread.currentThread().getName());
			
			
		}
		
	}
	
	
	public static void main(String[] args){
		
		MultiThreadEx srt1 = new MultiThreadEx();
		Thread firstThread = new Thread(srt1,"첫번재 스레드");
		firstThread.start();
		
		MultiThreadEx srt2 = new MultiThreadEx();
		Thread secondThread = new Thread(srt2,"두번째 스레드");
		secondThread.start();
		
	}

}
