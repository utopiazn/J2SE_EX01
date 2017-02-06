package feb06;


/*
final class Me1{
	
	int var = 100;
	public void setVar(int var){
		this.var = var;
	}
	
}
*/


// 수정
class Me1{
	
	int var = 100;
	public void setVar(int var){
		this.var = var;
	}
	
}



public class MeEx1 extends Me1 {   //final  클래스를 상속할수 없다.
	
	public void setVar(int var){		
		
		this.var = var;
		
	}
	
	public static void main(String[] args){
		MeEx1 me1 = new MeEx1();
		me1.setVar(1000);
		
	}

}
