package feb01;


//this : 전역변수를 의미
public class ThisTest1 {

	int a =100;
	
	public void setA(int a){
		
		this.a = a;
		
	}
	public static void main(String[] args){
		ThisTest1 tt = new ThisTest1();
		tt.setA(200);
		System.out.println(tt.a);
	}
}
