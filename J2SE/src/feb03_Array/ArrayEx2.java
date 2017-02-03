package feb03_Array;

public class ArrayEx2 {
	
	public static int max(int[] score){
		
	
		return findScore(score,"Max");		
	}
		
	public static int min(int[] score){
		
		return 	findScore(score,"Min");
	}
	
	public static int findScore(int[] score,String type){
		
		
		if( score.length <1){			
			System.out.println("데이터가 없습니다..");
			return -1;
		}
		
		
		int res = score[0];	
		
		for(int i: score){			
			if(res <i && type.equals("Max")){				
				res =i;
			}else if(res >i && type.equals("Min")){
				res =i;
			}			
		}		
		return res;	
	}
	
	

	public static void main(String[] args){
		
		int[] score ={ 79,88,91,33,100,55,95};
		
		int max = score[0];  // 배열의 첫 번째 값으로 최대값을 초기화 한다.
		int	min = score[0];  // 배열의 첫 번째 값으로 최소값을 초기화 한다.
		
		for(int i=1;i<score.length;i++){
			
			if(score[i]>max){
				max = score[i];
			}
			if(score[i]<min){
				min = score[i];
			}					
		}
		
		System.out.println("최대값 :" + max);       
		System.out.println("최소값 :" + min);
		
		
		System.out.println("");
		
				
		System.out.println("최대값 :" + max(score));       
		System.out.println("최소값 :" + min(score));       
		
		
		
	}
	
	

	
	
}
