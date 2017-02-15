package feb14_add;

public class ThreadEx11 implements Runnable {
	
	static boolean autoSave = false;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			
			try{
				Thread.sleep(3*1000); // 3초마다
				
			}catch(InterruptedException e){}
			
			
			//autSavedml 값이 true이면 autoSave()를 호출한다.
			if(autoSave){
				autoSave();
			}
			
		}
		
	}
	
	public static void main(String[] args){
		
		Thread t = new Thread(new ThreadEx11());
		t.setDaemon(true); // 이 부분이 없으지 않는다면 종료 됨
		t.start();
		
		for(int i=1; i<=20; i++){
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
			else 
				autoSave = false;
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void autoSave(){
		System.out.println("작업파일이 자동저장되었습니다.");
	}

}
