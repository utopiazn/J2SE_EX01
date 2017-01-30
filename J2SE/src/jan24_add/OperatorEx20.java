package jan24_add;

public class OperatorEx20 {
	
	public static void main(String[] args){
		
		// i가 1부터 10000이 될 때까지, {} 안의 문자을 반복 수행한다.		
		for(int i=1; i <=1000; i++){
			
			if(i%3==0){  // i가 3으로 나우어 떨지면, 3의 배수 이므로  출력한다.
				
				System.out.println(i);
			}
		}		
	}
}
