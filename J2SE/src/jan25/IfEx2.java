package jan25;

//기본 if문
public class IfEx2 {
	
	public static void main(String[] args){
		
		
		if(args.length == 0){
			
			System.out.println("전달된 인자 없음");
			return ;
			
		}
		
		
		for(int i=0; i<args.length;i++){
			
			int su1 = Integer.parseInt(args[i]);
			
			System.out.println("전달받은"+ (i+1) +"번째 인자:"+args[i]);
			
			String str;
			
			if(su1 >=50){
				
				str = "50이상"; 
			}else{
				str = "50 미만";
			}
			
			System.out.println(str +"입니다.\n-------------------------");
		}
		
		
		
		/////////// 원본
	/*	
		int su1 = Integer.parseInt(args[0]);
		
		String str;
		
		if(su1 >= 50){    // 기본조건 true
			
			str = "50이상";   // 조건이 참일때 실행하는 실행문
			
		}else{ // 기본조건  false
			
			str = "50 미만"; // 조건의 결과가 거짓일때 실행
							// 하는 실행문
		}
		
		System.out.println(str+"입니다.");
*/		
	}	

}
