package jan24;

public class OpenEx10 {
	public static void main(String[] args){
		
		int a = 14;
		int b = 15;
		
		//String c = "";
		String s = "크다";
		
		//s = ++a >= b ? c = "a가 크다" : c = "b가 크다.";
		
		s += ++a >=b  ? ( a == b ? "가 아니라 같네" : (a-b) + "만큼 a가..") : (b-a) + "만큼 b가.";
		// s= "크다"+
		System.out.println(s);
		
		
		
				
				
		
	}
}
