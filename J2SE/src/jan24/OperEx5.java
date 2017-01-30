package jan24;

public class OperEx5 {
	
	public static void main(String[] args){
		int a =10;
		int b =20;
		
		boolean c= ((a+=12) > b) && (a==(b+=2));
				   //22    >20    &&  22  == 22 
				   //  true	      &&    true  = true
		
		System.out.println("c=" +c);
		System.out.println("a="+a);
		System.out.println("b="+b);
					     
	}

}
