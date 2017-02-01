package feb01;

public class ThisConstrEx {
	
	String str; // 전역변수
	
	public ThisConstrEx(){
		this("");
	}
	
	public ThisConstrEx(char[] ch){
		this(String.valueOf(ch));
	}
	
	public ThisConstrEx(long lo){
		this(String.valueOf(lo));
	}
	
	public ThisConstrEx(boolean b){
		this(String.valueOf(b));
	}
	
	public ThisConstrEx(String str){
		
		this.str = str;
		System.out.println(str+"의 길이 : "+str.length());
	}
	
	public static void main(String[] args){
		
		char[] ch = {'m','y','♥','S','u','n','A','e'};
		long lo = 900000000;
		boolean b = true;
		
		ThisConstrEx te1 = new ThisConstrEx();
		ThisConstrEx te2 = new ThisConstrEx(lo);
		ThisConstrEx te3 = new ThisConstrEx(b);
		ThisConstrEx te4 = new ThisConstrEx(ch);
		
		
	}
	
	

}
