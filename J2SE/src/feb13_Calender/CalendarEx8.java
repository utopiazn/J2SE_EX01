package feb13_Calender;

import static java.lang.System.out;

public class CalendarEx8 {
	
	public static void main(String[] args){
		
	
		String date1 = "201408";
		String date2 = "201305";
		
		// 년과 월을 substring 으로 잘라서 정수로 변환한다.
		// 년에 12를 곱해서 월로 변환한 다음에 뺄셈을 하면 개월차를 구할수 있다.
		
		int month1 = Integer.parseInt(date1.substring(0, 4))*12	+ Integer.parseInt(date1.substring(4)) ;
		int month2 = Integer.parseInt(date2.substring(0, 4))*12	+ Integer.parseInt(date2.substring(4)) ;
		
		//out.println( Integer.parseInt(date1.substring(0, 4))*12+"   "+Integer.parseInt(date1.substring(4)) );
	
		out.println(date1 + "과  "+ date2 + "의 차이는 "+ Math.abs(month1-month2)+ "개월 입니다." );
		
	}	

}
