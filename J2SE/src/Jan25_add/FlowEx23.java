package Jan25_add;

public class FlowEx23 {

	public static void main(String[] args){
		
		
		int sum = 0;
		int i = 0;
		
		while(sum +i <= 100){
			
			sum += ++i;  //  0 +1
			System.out.println(i + " - " + sum);
			
		}
		
		
	}
}
