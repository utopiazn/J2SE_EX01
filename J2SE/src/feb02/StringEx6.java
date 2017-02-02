package feb02;

public class StringEx6 {
	
	public static void main(String[] args){
		
		String s1 = "   aaa   ";
		String msg = null;
		
		msg = s1.replace("aa", "b");  //ba
		System.out.println("msg :" +msg);
		
		msg = s1.toUpperCase(); // AAA
		System.out.println("msg :"+msg);		
		
		
	}
	

}
