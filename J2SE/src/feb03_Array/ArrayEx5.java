package feb03_Array;

public class ArrayEx5 {
	
	public static void main(String[] args){
		
		int[] number = new int[10];
		
		
		System.out.print("생성된 값:");
		
		for(int i =0; i<number.length; i++){
			number[i] = (int)(Math.random()*10);
			System.out.print(number[i]);
		}
		System.out.println();
		
		for(int i=0; i< number.length; i++){
			boolean changed = false;  // 자리바굼이 발생했는지를 체크한다.
			
			for(int j=0; j<number.length-1-i; j++){
				
				if( number[j] > number[j+1]){ //옆의 값이 크면 서로 바꾼다.
					
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changed = true; // 자리바굼이 발생햇으니 changed를 true로 					
					
				}				
			}			
			
			if(!changed) break; // 자리바굼이 없으면 반복문을 벗어난다.
			
			System.out.print( (i+1) + "번째 값 :");
			
			for(int k=0;k< number.length; k++)				
				System.out.print(number[k]);  //정렬된 결과를 출력;
				
			System.out.println();
			
			
		}
		
		
		
		
	}

}
