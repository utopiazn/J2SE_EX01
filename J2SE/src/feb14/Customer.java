package feb14;

public class Customer implements Runnable{
	private Car car;

	public Customer(Car car) {
		// TODO Auto-generated constructor stub
		this.car= car;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String carName = null;
		
		for(int i=0; i<20;i++){
			carName = car.pop();
			try{
				Thread.sleep((int)(Math.random()*200));
			}catch(InterruptedException ie){
				ie.printStackTrace();
				
			}
		}
	}
	

}
