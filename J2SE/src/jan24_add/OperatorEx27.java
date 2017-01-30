package jan24_add;

public class OperatorEx27 {
	
	public static void main(String[] args){
		
		int x = 10;
		int y = -10;
		
		int absX = (x >=0) ? x : -x; //10 
		int absY = (y >=0) ? y : -y; //10
		
		
		System.out.println("x=" + x + "일때, x의 절대 값은"+Math.abs(x));
		System.out.println("y=" + y + "일때, x의 절대 값은"+Math.abs(y));
		
		System.out.println("--------------------------------------");
		
		System.out.println("x= 10 일때, x의 절대 값은"+absX);
		System.out.println("y= -10일때, y의 절대 값은"+absY);
		
	}

}
