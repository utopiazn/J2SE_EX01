package jan25;

public class MultiForEx1 {

	public static void main(String[] args){
	//원본

		for(int i=1; i<=9 ; i++){
			
		
			for(int j=2; j<=9; j++){
				System.out.println(j+ "*" + i + "=" + i*j + "\t");
			}
	
			System.out.println();
		}
	
	
	// i =1 j = 2,3,4,5,6,7,8,9
	// i =2 j = 2,3,4,5,6,7,8,9
	// i =3 j = 2,3,4,5,6,7,8,9
	// i =4 j = 2,3,4,5,6,7,8,9
	// i =5 j = 2,3,4,5,6,7,8,9
	// i =6 j = 2,3,4,5,6,7,8,9
	// i =7 j = 2,3,4,5,6,7,8,9
	// i =8 j = 2,3,4,5,6,7,8,9
	// i =9 j = 2,3,4,5,6,7,8,9
	
		char ch =65; // "A"
		
		for(int i=0; i<5; i++){
			
			for(int j=0; j<4 ; j++){
				System.out.println(ch++ + "\t");
			}
			
			System.out.println();
		}
	
	}	
}
