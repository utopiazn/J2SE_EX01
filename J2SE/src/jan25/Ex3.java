package jan25;

public class Ex3 {
	
	public static void main(String[] args){
		
		int k =0;
		
		for( int i=1; i<5; i++ ){  // 4 (1 2 3 4)
			for( int j=1 ; j <=i ; j++){
				k+=j;
				System.out.print(k+ "\t");
			}
			System.out.println();
		}
		
	}

}

//k = k + j
//i=1 j=1 k = 0 + 1 = 1
//i=2 j=1,2 k = 1 + 1 = 2, k = 2 + 2 = 4
//i=3 j=1,2,3
//i=4 j=1,2,3,4
