package feb14;

import static java.lang.System.out;

public class SingleRunnableEx implements Runnable {

	private int temp[];
	
	public SingleRunnableEx(){
		
		temp = new int[10];
		
		for(int start=0;start<10;start++){
			temp[start] = start;
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int start : temp){
			
			try{
				Thread.sleep(200);  //0.2초
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			
			out.printf("스레드 이름 : %s,",	Thread.currentThread().getName());
			out.printf("temp value : %d %n",start);
		}
	
	}
	
	
	public static void main(String[] args){
		
		SingleRunnableEx str = new SingleRunnableEx();
		
		Thread t = new Thread(str,"찻번째");
		t.start();
		
		SingleRunnableEx srt2 = new SingleRunnableEx();
		Thread t2 = new Thread(srt2,"두번째");
		t2.start();
		
		
		
		
	}

}
