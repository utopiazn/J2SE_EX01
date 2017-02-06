package feb06;

public class Zerg extends Unit {

	boolean fly;
	



	@Override
	public void decEnerge() {
		// TODO Auto-generated method stub
		
		energe -=6;		
	}
	
	public  Zerg(String n, boolean b){
		name =n;
		energe = 100;
		fly = b;
	}

}
