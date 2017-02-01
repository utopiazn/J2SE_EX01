package feb01;
//this: 자기 자신.... 객체를의미
public class ThisTest {
	public ThisTest(){
		System.out.println("객체생성: "+ this);		
	}
	public static void main(String[] args){
		ThisTest tt = new ThisTest();
		System.out.println("객체생성 후 : "+ tt);
	}
}
