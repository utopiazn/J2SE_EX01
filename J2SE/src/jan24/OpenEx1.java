package jan24;

public class OpenEx1 {
	
	
	public static int ga = 20;
	public static int gb = 7;
	

	public static int getsum(){		
		return ga+gb;		
	}
	
	
	
	
	
	public static void main(String[] args){
		
		int a,b,c;
		
		a =20;		
		b=7;		
		
		c = a+b;		
		System.out.println("a+b =" +c);
				
		c = a-b;
		System.out.println("a-b" + c);
		
		c = a % b;		
		System.out.println("a%b" + c );
		
		c = a* b;
		System.out.println("a*b"+c);
		
		
		c = a/b;
		System.out.println("a/b"+c);
		
		
		
		
		//테스트  
		System.out.println("a+b ="+getsum());
		
		
		
	}
}
