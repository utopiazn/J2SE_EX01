package feb06;

class Me{
	
	final int var = 100;
	public void setVar(int var){ // 상속받는 클래스에서 오버라이딩 할수 없다.
		//this.var =var;  // 오류  var final선언오로 상수화가 되었기 때문.
	}
	
}


public class MeEx extends Me{
	
	public void setVar(int var){
	
		// 상수화를 다시 초기화 할수 없다,
		//	this.var = var;   // 오류  var final선언오로 상수화가 되었기 때문.
	}
	
	public static void main(String[] args){
		MeEx me = new MeEx();
		me.setVar(1000);
	}
	

}
