package feb03_Array;

public class ArrayEx6 {

	public static void main(String[] args){
		
		int[] number = new int[10];
		int[] counter = new int[10];
		
		

		for(int i =0; i<number.length; i++){
			System.out.print(number[i] = (int)(Math.random()*10));
		}
		
		System.out.println();
		
	
		
		//숫자 개수 생성.
		for(int i = 0; i<number.length; i++){
			
			System.out.println(number[i]);
			counter[number[i]]++;
		}
		
		for(int i =0; i < counter.length; i++){
			System.out.println(i+"의 개수 :"+ counter[i] );
		}
		
	
		
	}
}
