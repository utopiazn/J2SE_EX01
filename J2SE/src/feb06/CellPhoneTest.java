package feb06;

public class CellPhoneTest {
	
	public static void main(String[] args){
		
		D_caPhone dca = new D_caPhone(
				"IN-7600",
				"011-9XXX-9XXX",
				60,
				"400만"
				);
		
		MP3Phone mp = new MP3Phone(
				"IN-600",
				"011-9XXX-9XXX",
				60,
				256
				);
		
		System.out.println( dca.getModel()+","+
				dca.getchord()+","+dca.getNumber());
		
				
		System.out.println(mp.getModel()+","+
				mp.getchord()+","+mp.getNumber());
		
		
				
	}

}


//CellPhone
//   l
//----------------                        =====>   CellPhoneTest
//l                 l
//D_caPhone   MP3Phone


/* 결과
IN-7600,60,011-9XXX-9XXX
IN-600,60,011-9XXX-9XXX
*/