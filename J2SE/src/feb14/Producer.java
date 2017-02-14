package feb14;

public class Producer implements Runnable {

	private Car car;
	
	public Producer(Car car) {
		// TODO Auto-generated constructor stub
		this.car = car;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String carName = null;
		
		for(int i=0; i<20; i++){
			
			carName = car.getCar();
			car.push(carName);
			
			try{
				Thread.sleep((int)(Math.random()*200));
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			
		}
	}

}
