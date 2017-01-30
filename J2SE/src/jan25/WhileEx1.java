package jan25;

public class WhileEx1 {
	public static void main(String[] args){
		
		
		
	
		
		
		ParameterCheck b = new ParameterCheck(args); 		
		
		if(!b.getParameterCheck()){
			return;
		}
		
			
		for(int i =0; i<b.getParameterLength(); i++){
			
			String res;
			
			System.out.println("전달받은"+ (i+1) +"번째 인자:"+args[i]);
			
			res = args[i];
			
			//res = "133~30";
			
			//int c =res.indexOf("~");
			
	
			String strStart = res.substring(0, res.indexOf("~"));			
			String strEnd = res.substring(res.indexOf("~")+1, res.length());
			
			System.out.println( strStart + " :  "  +strEnd);
			
			
			
			
			int sum, iStart, iEnd; //변수 선언
			sum = 0; // 변수값을 활당
			
			
			if(Integer.parseInt(strStart) >= Integer.parseInt(strEnd)){  // 앞에 수가 큰경우
				
				iEnd = Integer.parseInt(strStart);
				iStart =Integer.parseInt(strEnd);
				
				
			
				
				
				
				//System.out.println( "111     " + strStart + " :  "  +strEnd +"  "+ iStart +" : "+iEnd);
				
				
			}else{
				
				iStart = Integer.parseInt(strStart);
				iEnd =Integer.parseInt(strEnd);
				
				
				strStart  = String.valueOf(iStart);
				strEnd  = String.valueOf(iEnd);
				
				//System.out.println( "222     " + strStart + " :  "  +strEnd);
			
			}
			
			strStart  = String.valueOf(iStart);
			strEnd  = String.valueOf(iEnd);
			
				
			//System.out.println(iStart +"~" + iEnd + "까지의 합" +  sum);
	
			
			while(iStart <= iEnd){
				sum += iStart;
				iStart++;
				
				//System.out.println(iStart +"~" + iEnd + "까지의 합" +  sum);
			}
			
			System.out.println(strStart +"~" + strEnd + "까지의 합" +  sum);
			
		
			
			
		}
		
		
	while(true){
			
			
			System.out.println("dd");
			
			break;
		}
		
		
		
	/*	
		// 원본
		
		int sum,su; //변수 선언
		sum = su = 0; // 변수값을 활당
		int j = Integer.parseInt(args[0]);
		
		while(su <= j){
			sum += su;
			su++;
		}
		
		System.out.println("1~" + j + "까지의 합" +  sum);
		
		*/
		
	}

}
