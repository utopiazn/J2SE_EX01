package feb06;

public class Terran extends Unit {

	boolean fly;
	
	public Terran(String n, boolean b){
		name= n;
		energe = 100;
		fly = b;
	}
	
	@Override
	public void decEnerge() {
		// TODO Auto-generated method stub
		energe -=3;
		
	}

}
