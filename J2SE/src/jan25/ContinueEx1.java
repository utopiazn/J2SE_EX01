package jan25;

public class ContinueEx1 {
	public static void main(String[] args){
		
		for(int i=1; i<= 1000 ; i++){
			if(i%2 ==0) // 2의 배수
				continue;
			
			System.out.println("i값:"+i);
		}
		
	}

}


//0~9까지의 숫자에서 4의 배수를 제외한
//숫자를 출력 ===> continue