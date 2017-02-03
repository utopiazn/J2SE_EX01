package feb06;

class CellPhone {

	String model;  //멤버 변수
	String number; // 맴버변수
	int chord; 	   // 맴버변수	
	
//setXXX(): 설정관련내용
//getXXX(): 설정내용을 리터	
//isXXX() : 리턴타입이 boolean형이다.  
	
	protected void setNamer(String n){
		number=n;
	}
	public String getModel(){
		return model;
	}
	
	public int getchord(){
		return chord;
	}
	
	public String getNumber(){
		return number;
	}		
}
