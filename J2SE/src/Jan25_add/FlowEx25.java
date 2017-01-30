package Jan25_add;

public class FlowEx25 {
	
	public static void main(String[] args){
		
		int sum =0;
		int i =1;
		
		while(true){
			
			if(sum >100){							
				break;
			}
		
			System.out.println( (sum+i) + " = " +sum+ "+" + i);
				
			sum += i;
			
			System.out.println("카운터"+i + "sum :" +sum);
			i++;			
			
		
		}
		
		System.out.println("i=" +i);
		System.out.println("sum" + sum);
	}

}
