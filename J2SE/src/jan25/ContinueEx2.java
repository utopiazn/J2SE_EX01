package jan25;

public class ContinueEx2 {
	public static void main(String[] args){
		
		label3: //레이블 설정.
		for(int i =0; i<5 ; i++){  //5
			
			for(int j = 0; j<5; j++){
				
				if(j == 3){
					continue label3;					
				}
				
				System.out.println("i값:"+i+"j값:"+j);
				
			}
			
		}
			
		
	}

}
