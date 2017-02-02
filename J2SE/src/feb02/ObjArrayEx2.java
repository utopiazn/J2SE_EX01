package feb02;

public class ObjArrayEx2 {

	public static void main(String[] args){
		
		String[] arr; // 객체형 배열 선언.
		
		if(args.length>0){ // 실행할때 명령출 인수를 넣어줬다면....
			arr = args;    // args가 가리키고 있는 Heep 영역메리의 주소를 arr도 가리키도록 설정한다.
						   // 메모리 주소복사,
			for(int i=0; i<arr.length;i++){
				System.out.println("arr["+i+"]:" +arr[i]);
			}
			
		}else{
			System.out.println("arg의 내용이 없습니다");
		}
			
	}
}
