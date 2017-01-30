package jan25;

public class IfEx4 {

	public static void main(String[] args){
	
		ParameterCheck b = new ParameterCheck(args); 		
		
		if(!b.getParameterCheck()){
			return;
		}
		
			
		for(int i =0; i<b.getParameterLength(); i++){
			
			String res;
			
			System.out.println("전달받은"+ (i+1) +"번째 인자:"+args[i]);
			
			
			
			if( b.getCmpStr(i, "포도") ){
			
				res = "달다";
				
			}else if( b.getCmpStr(i, "수박") ){
				
				res = "시원하다";				
			
			}else if(b.getCmpStr(i, "딸기")){
			
				res = "맛있다";
			}else{
				
				res = "기타";
			
			}
			
			
			System.out.println(res + "\n-------------");			
	 			
		}
		
		// 원본
		System.out.println("\n-----원본------");			
		String data = args[0];
		String res;
		
		if( data == "포도" ){
			res ="달다";
		}else if(data.equals("수박")){
			res = "시원하다";
		}else if(data.equals("달기")){
			res = "맛있다";
		}else{
			res = "기터";
			
		}
			
		System.out.println(res);
		
		
				
		
	}
}
