package feb06;

public class Product { /* extends Object*/
	private String name; // 멤버 변수 선언
	private int price; 
	
	public Product(String name,int price){ //생성자
		this.name = name;
		this.price = price;
		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean result = false;
		if((obj != null) && obj instanceof Product){
			Product p = (Product) obj;
			if((name.equals(p.name)) && price == p.price){
				result = true;
			}
		}
		
		return result;
		//return super.equals(obj);		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return ((name.hashCode() ^(new Integer(price).hashCode())));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
