package fab03;

public class AutoboxingEx2 {
	
	Integer var;
	
	public void setInt(int i){
		var = i;  //오토박싱
	}
	
	public Integer getInt(){
		return var;
	}
	
	public static void main(String[] args){
		
		AutoboxingEx2 a1 = new AutoboxingEx2();
		a1.setInt(10000);
		int res = a1.getInt(); // 언박싱
		System.out.println("res : "+res);
		
	}

}//랩퍼클래스와 기본 데이터 타입에만 성립
