package jan25;

public class GuguDanEx1 {
	public static void main(String[] args){
		
		ParameterCheck b = new ParameterCheck(args); 		
		
		if(!b.getParameterCheck()){
			return;
		}
		
			
		
		int dan = Integer.parseInt(args[0]);
		
		System.out.println(dan+"단");
		System.out.println("------------");
		
		for(int i=1; i <= 9; i++){
			
			System.out.println(dan+"*"+i+"="+ (dan*i) );
			
		}
		
	}

}
