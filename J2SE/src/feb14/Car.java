package feb14;
import java.util.*;

public class Car {
	
	private List<String> carList = null;
	
	public Car(){
		
		carList = new ArrayList<String>();
	}

	public String getCar(){
		
		String carName = null;
		
		switch((int)(Math.random()*3)){
		
		case 0 :carName = "SM5"; break;
		case 1 :carName = "소니티"; break;
		case 2 :carName = "그렌져"; break;
		}
		
		return carName;
	}
	
	public synchronized String pop(){
		String carName = null;
		
		if(carList.size() == 0){
			try{
				System.out.println("차가 없어요 생상할때 까지 기다려 주세요"  );
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		carName = (String)carList.remove(carList.size() -1);
		
		System.out.println("손님이 차를 사갔습니다.. 손님이 구입한 차이름은 =>\""+ carName+"\"");
		
		return carName;
	}
	
	public synchronized void push(String car){
		carList.add(car);
		System.out.println("차가 만들어 졌습니다. 차이름은 \" "+ car + "\"");
		
		if(carList.size() == 5){
			this.notify();  // 깨우기
		}
	}
	
}

