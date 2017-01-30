package jan25;

public class BreakEx2 {
	
	public static void main(String[] args){
		
		exit_For: // 레이블 설정
			for(int i=0; i<3; i++){  // 3
				
				//exit_For2:
				
				for(int j =0; j<5; j++){ //5
					
					if(j == 3)
						break exit_For;
					
				//	else if (j ==2)
				//		break exit_For2;
					
					System.out.println("i값:"+i+"j값:"+j);
					
				}
	
	
	
				
				
			}
		
	}

}

////i=0 j=0,1,2