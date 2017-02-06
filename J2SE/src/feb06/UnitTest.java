package feb06;

public class UnitTest {
	
	static void print(Unit u,String str){
		
		u.decEnerge();
		System.out.println(str+u.getEnerge());
		
		
		
	}

	public static void main(String[] args){
		
		Unit u = new Zerg("Hydralisk",false);		
		print(u,"z1의 Energe :");
		
		
		
		u = new Protoss("Corsair",true);
		print(u,"p1의 Energe :");
		
		u = new Terran("Marine", false);
		print(u,"t1의 Energe :" );
		
	}	
}

/*
z1의 Energe :94
p1의 Energe :99
t1의 Energe :97


 
 * */
