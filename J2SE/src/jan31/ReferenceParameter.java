package jan31;

// call by reference : 메서드에 전달된 매개변수의 원본은 매개변수 같이 변경된다..
public class ReferenceParameter {
	public void increase(int[] n){ // n = ref1 :ref1 이라는 배열이 가리키는 객체 n이라는 배열도 가리킨다 
	
		
	}
	
	public static void main(String[] args){
		
		int[] ref1 = {100,800,1000}; // ref1.length =3
		ReferenceParameter rp = new ReferenceParameter(); // 객체생성
		rp.increase(ref1);
		
	
		
		for(int i = 0 ; i < ref1.length ; i++){
			
			System.out.println("ref1["+i+"] : "+ ref1[i]); 
			
		}
			
		
		
	}

}

/*
 * ReferenceParameter
 * ==================
 * intcrease(int[] n)
 * 배열
 * int[] a = new int[5]
 * int[] a = {1,2,3,4,5};
 * a[0] =1 a[1]=2
 * 
 * 
 * 
 * 
 */
