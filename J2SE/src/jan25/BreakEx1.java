package jan25;

public class BreakEx1 {

	public static void main(String[] args){
		
		
		for( int i =0 ; i<3 ; i++ ){
			for( int j=0; j<5; j++){
				
				if(j == 3)
					break;
				System.out.println("i값:" + i +",j값: "+j);
				
			}
		}
	}

}

//i=0 j=0,1,2 i=1 j=0,1,2 i=2 j=0,1,2