package jan25;

public class IfEx3 {
	
	public static boolean  parameterCheck(String[] args){
		
		System.out.println("전달 인자 수: "+ args.length);
		
		if(args.length == 0){
			
			System.out.println("전달된 인자 없음");
			
			return false;
			
		}else{
			return true;
		}
		
	}
	
	public static void main(String[] args){
		
		
		//넘어온 인자 갯수 체크
		if(!parameterCheck(args)){
			
			return;
			
		}			
		
		//넘어온 인자 수만큼 반복문 실행.
		for(int i=0; i<args.length;i++){
			
			int su1 = Integer.parseInt(args[i]);			
			System.out.println("전달받은"+ (i+1) +"번째 인자:"+args[i]);
						
			
			String res;
			
			if(su1 >= 41){
				res = "고급";
			}else if(su1 >= 11){
				res = "중급";			
			}else if(su1>=0){
				res = "초급";
			}else{
				res = "음수";
			}			
			
			System.out.println(res+"입니다.\n----------------------");		
		
		}
		
		
		
		// 원본
		int su1= Integer.parseInt(args[0]);
		
		String res;
		
		if(su1 >= 41){
			res = "고급";
		}else if(su1 >= 11){
			res = "중급";			
		}else if(su1>=0){
			res = "초급";
		}else{
			res = "음수";
		}
		
		
		System.out.println(res+"입니다.");
		
		
	}
	
	

}
