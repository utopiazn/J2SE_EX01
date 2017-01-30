package jan25;

public class IfEx1 {

	public static void main(String[] args){
	
		//parameter,argument, 매개변수,인수 , 인자
		// 명령줄 인수 : 실행할때 넣어주는 인수
		//java 확장자를 뺀 클래스 명령줄 인수
		
		if(args.length == 0){
			
			System.out.println("전달된 인자 없음");
			return ;
			
		}
		
		
		
		for(int i=0; i<args.length;i++ ){
			System.out.println("전달 받은" + i + "번째 인자" +args[i]);
			
			int su1 = Integer.parseInt(args[i]);
			
			String str = "50미만";
			
			if(su1 >= 50)
				str = "50이상";
			
			 System.out.println(str+"입니다.\n-------------------------------------------");		
		}
		
		
		//int su1 = Integer.parseInt(args[1]);
		//String str = "50미만";
		
		
		//if(su1 >=50) // true
		//	str = "50이상";
		
		//System.out.println(str+"입니다");
		
	}
	
}
