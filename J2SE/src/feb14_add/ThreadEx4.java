package feb14_add;

public class ThreadEx4 {
	
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		
		for(int i= 0;i<300;i++){
			System.out.print("-");
		}
		System.out.println();
		
		System.out.print("소요시간1:"+(System.currentTimeMillis() - startTime));
		System.out.println();
		
		for(int i =0; i<300; i++){
			System.out.print("|");
		}
		
		System.out.println();
		
		System.out.println("소요시간2:"+(System.currentTimeMillis() - startTime));
	}

}
