package feb06;

public class Protoss extends Unit {

	boolean fly;
	
	@Override
	public void decEnerge() {
		// TODO Auto-generated method stub
		energe--;
		
	}
	
	public Protoss(String n,boolean b){
		name =n;
		energe =100;
		fly = b;
		
		
	}
	

}
