package feb14;

import static java.lang.System.out;

public class SingleThreadEx extends Thread {
	
	private int[] temp;
	
	public SingleThreadEx(String threadname){
		
		super(threadname);
		temp = new int[10];
		
		for(int start =0; start<temp.length; start++){
			temp[start] = start;
		}		
	} 
	

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub		
		//super.run();
		
		for(int start : temp){
			
			try{
				sleep(200);  //0.2초
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			
			out.printf("스레드 이름 : %s,",	currentThread().getName());
			out.printf("temp value : %d %n",start);
		}
	}




	public static void main(String[] args){
	
		
		SingleThreadEx st = new SingleThreadEx("첫번째");
		
		st.start();

		SingleThreadEx st2 = new SingleThreadEx("두번째");
		st2.start();	
		
	
		// 생성후  이시점에 run이 호출됨
		
		
	}




	

}
