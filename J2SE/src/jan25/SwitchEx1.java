package jan25;

public class SwitchEx1 {
	public static void main(String[] args){
		
		
		ParameterCheck b = new ParameterCheck(args); 		
		
		if(!b.getParameterCheck()){
				return;
		}
		
		
		
		String str = args[0];
		
		String strRes;
		
		switch(str)
		{
			case "1": 
			case "3":			
			case "5":
			case "7":
			case "8":
			case "10":
			case "12":
				strRes = "31";
				break;
				
			case "4":
			case "6":
			case "9":
			case "11":
				strRes = "30";
				break;
			case "2":
				strRes = "29";
			default :
				strRes ="몰라 ㅡ,,ㅡ;;";
		}
		
		System.out.println(str+ "월은" + strRes+"일까지 입니다. \n----------------") ;

		
		
			
		//원본
		


		
		
		
		int month = Integer.parseInt(args[0]);
			
		
		String res;
		
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:				
			case 8:
			case 10:
			case 12: 
				res = "31";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				res = "30";
				break;
			case 2:
				res = "29"; 
				break;
			default :
				res = "몰라";
				break;				
		}
		
		System.out.println(month+ "월은" + res+"일까지 입니다,") ;
		
	}

}
