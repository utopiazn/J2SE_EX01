package jan24_add;

public class OperatorEx15 {
	public static void main(String[] args){
		
		char c = 'a';
		for(int i =0; i<26; i++){ // 불럭{} 안에 문장을 26본울 반복한다.
			System.out.print(c++); // 'a'부터 26개의 문자를 출력한다.
		}
		
		System.out.println(); // 줄바뀸울 헌다.
		
		c='A';
		
		for(int i=0; i<26; i++){  // 불럭{} 안에 문장을 26본울 반복한다.
			
			System.out.print(c++);
		}
		
		System.out.println(); // 줄바뀸울 헌다.
		
		c ='0';
		
		for(int i=0; i<10; i++){  // 불럭{} 안에 문장을 0본울 반복한다.
			
			System.out.print(c++);
			
		}
		
		System.out.println(); // 줄바뀸울 헌다.
		
		
	}

}
