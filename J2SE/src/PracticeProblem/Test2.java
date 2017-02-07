package PracticeProblem;



public class Test2 {
	
   
	public static void main(String[] args){

	
		
		for(int i =0; i <5; i++){
			
			for(int j =0; j < i+1; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		System.out.println("\n 이차원 배열");
		

		String[][] number = new String[5][5];
		 	
		for(int i =0; i <number.length; i++){
			
			
			for(int j =0; j < number[i].length; j++){
				
				if(j < i+1)
					number[i][j] = "*";
				else
					number[i][j] = "";
			}			
		}
		
		for(int i =0; i <number.length; i++){
			
			for(int j =0; j < number[i].length; j++){
				System.out.print(number[i][j]);	

			}
			System.out.println("");	
		}
			
				
		
		System.out.println("\n 가변 배열");
		
		String[][] test = new String[5][];
		
		for(int i =0; i <test.length; i++){
			
			String[] t2 = new String[i+1] ;
			
			for(int j =0;j<t2.length;j++){
				
				t2[j] = "*";
			}
			
			test[i] = t2;			
		}
		
		
		
		for(int i =0; i <test.length; i++){
			
			for(int j =0; j < test[i].length; j++){
				System.out.print(test[i][j]);	

			}
			System.out.println("");	
		}
		
		
	}

}
