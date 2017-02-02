package feb02;

public class ObjArrayEx1 {

	public static void main(String[] args){
		String[] arr; //객체형배열 선언.
		arr = new String[3]; // 객체형 배열 생성
		
		arr[0] = "java";
		arr[1] = "Arry";
		arr[2] = "Test";
		
		for(int i =0 ; i<arr.length;i++){
			System.out.println("arr["+i+"]");
		}
		
	}
}
