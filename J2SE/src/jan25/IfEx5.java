package jan25;

public class IfEx5 {

	public static void main(String[] args){
	
		
		
		
		ParameterCheck b = new ParameterCheck(args); 		
			
		if(!b.getParameterCheck()){
				return;
		}
		
		
		
		for(int i =0; i<b.getParameterLength(); i++){
			
			String res;			
			System.out.println("전달받은"+ (i+1) +"번째 인자:"+args[i]);
			
			int jumsu = Integer.parseInt(args[i]);
			
			if(jumsu >= 90 && jumsu <= 100){
				res = "A학점";		
			}else if(jumsu>=80 && jumsu<90){
				res = "B학점";
			}else if(jumsu>=70 && jumsu<80){
				res = "C학점";
			}else if(jumsu>=60 && jumsu<70){
				res = "D학점";
			}else if(jumsu>=50 && jumsu<60){
				res = "E학점";
			}else if(jumsu>100 && jumsu<0){
				res = "점수를 잘못 입력했음.!!";
			}else{
				res = "죽어라....FFFFFFFFFFFFFF";
			}
		
			System.out.println(res+"\n---------------------");
			
		}
		
		
		
		
		// 원본
	
		int jumsu = Integer.parseInt(args[0]);
		//java 확장자를 뺀 ㅏ일 이름 명령줄1
		
		
		String res;
		
		if(jumsu >= 90 && jumsu <= 100){
			res = "A학점";		
		}else if(jumsu>=80 && jumsu<90){
			res = "B학점";
		}else if(jumsu>=70 && jumsu<80){
			res = "C학점";
		}else if(jumsu>=60 && jumsu<70){
			res = "D학점";
		}else if(jumsu>=50 && jumsu<60){
			res = "E학점";
		}else{
			res = "죽어라....FFFFFFFFFFFFFF";
		}
		
		System.out.println(res);

	}
}
