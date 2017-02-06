package feb06;

public class ProductEx1 {
	
	public static void main(String[] args){
		
		Product p1 = new Product("En,Ca", 7078);
		Product p2 = new Product("En,Ca", 7078);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println("p1 hashCode" + p1.hashCode()+" , p1 : "+p1.toString());
		
		System.out.println("p2 hashCode" + p2.hashCode()+" , p2 : "+p2.toString());
		
		
		
		
		
	}

}


/*

false
true
p1 hashCode67051495 , p1 : En,Ca
p1 hashCode67051495 , p2 : En,Ca


*/