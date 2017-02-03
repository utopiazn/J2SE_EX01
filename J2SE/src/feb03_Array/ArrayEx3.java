package feb03_Array;

public class ArrayEx3 {
	public static void main(String[] args){
		
		int[] number = new int[10];
		
		for(int i = 0; i<10; i++){
			number[i] = i; // 배열을 0~9의 숫자로 초기화 한다.
			System.out.print(number[i]);
		}
		
		System.out.println();
		
		for(int i=0; i <100; i++){
			int n = (int) ( Math.random()*10); // 0~9중의 한 값을 얻는다
			
			System.out.println(n);
			int temp = number[1];
			number[1] = number[n];
			number[n] = temp;			
			
		}
		
		for(int i=0; i< number.length; i++){
			System.out.print(number[i]); // 배열의 내용을 출렵한다.
		}
		
		
	}

}
