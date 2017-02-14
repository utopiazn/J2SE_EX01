package feb14;

 class MyRunnableOne implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
		first();
	}
	
	public void second(){
		System.out.println("second");
	}
	
	public void first(){
		System.out.println("first");
		
	}
	
	
	
	
}


public class UncertainThreadEx {
	
	public static void main(String[] args){
		
		System.out.println("main start");
		
		Runnable r = new MyRunnableOne();
		Thread myThred = new Thread(r);
		
		myThred.start();
		
		System.out.println("main end");
		
		
	}
			
			
			

}
/*결과
main start
main end
run
first

*/