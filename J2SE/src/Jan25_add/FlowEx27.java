package Jan25_add;

public class FlowEx27 {
	
	public static void main(String[] args){
		
		// for 문에 loop1 이라는 이름을 붙였다.
		Loop1:		for(int i=2; i <=9;i++){
			for (int j=1 ; j<=9; j++ ){
				
				if(j==5){
					//break Loop1;
					//break;
					continue Loop1;
					
				}
				
				
				System.out.println(i+" * "+ j + " = " + i*j);
				
				
			}
			
			System.out.println("\n\n");
		
		
		}
		
	}

}
