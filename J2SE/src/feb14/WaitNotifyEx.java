package feb14;

class ATMTwo implements Runnable{
	private long depositeMoney = 10000;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(this){
			for(int i=0; i<10 ;i++){
				
				if(getDepositeMoney()<=0) break;
				
				withDraw(1000);
				
				if( getDepositeMoney() == 2000 ||
					getDepositeMoney() == 4000 ||
					getDepositeMoney() == 6000 ||
					getDepositeMoney() == 8000 ){
					
					
					try{
						this.wait();
						
					}catch(InterruptedException ie){
						ie.printStackTrace();
					}
				}else{
					this.notify();
				}
				
			}
		}
		
	}
	
	public void withDraw(long howMuch){
		
		if(getDepositeMoney()>0){
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName()+" , ");
			System.out.printf("잔액 : %,d 원 %n", getDepositeMoney());
		}else{
			System.out.print(Thread.currentThread().getName()+" , ");
			System.out.println("작액이 부족합니다.");
		}
	}
	
	public long getDepositeMoney(){
		return depositeMoney;
	}
	
	
	
	
}

public class WaitNotifyEx {

	public static void main(String[] args){
		
		ATMTwo atm = new ATMTwo();
		Thread mother = new Thread(atm,"mother");
		Thread son = new Thread(atm,"son");
		
		mother.start();
		son.start();
		
		
	}
}
