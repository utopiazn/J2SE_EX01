package feb02;

public class ObjArrayEx3 {
	public static void main(String[] args){
		
		// arr.length = 3
		String[] arr = {
				"윤아",
				"♥",
				"윤서"
				};
		
		
		// 기존
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("=================================");
		
		//개선된 :loop
		for(String s: arr)  // arr이라는 0번째 인덱스에 해당하는 값부터 꺼내와서 s라는 변수에 저장해라!
			System.out.println(s);
		
	}

}
