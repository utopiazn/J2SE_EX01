package feb13_Calender;


import java.util.*;


import static java.lang.System.out;





public class CalendarEx1 {

	
	public static void main(String[] args){
		
		//기본적으로 현재 날짜와 시간으로 설정한다.
		Calendar today = Calendar.getInstance();
		
		out.println("이 해의 연도 : " + today.get(Calendar.YEAR));//이 해의 연도2017
		out.println("월(0~11, 0: 1월) : " + today.get(Calendar.MONTH)); //월(0~11, 0: 1월) : 1
		out.println("이 해의 몇째주 : " + today.get(Calendar.WEEK_OF_YEAR)); //이 해의 몇째주 : 7
		out.println("이달의 몇 째주 : " + today.get(Calendar.WEEK_OF_MONTH)); // 이달의 몇 째주 : 3

		//DATE와 DAY_OF_MONTH
		out.println("이 달의 몇 일 :"+ today.get(Calendar.DATE));  // 현재 일
		out.println("이 달의 몇 일 :"+ today.get(Calendar.DAY_OF_MONTH));  // 현재 일

		out.println("이 해의 몇일 "+  today.get(Calendar.DAY_OF_YEAR)); // 이 해의 몇일 44
		out.println("요일(1~7, 1:일요일):"+ today.get(Calendar.DAY_OF_WEEK));//요일(1~7, 1:일요일):2  == 월요일
		
		out.println("이 달의 몇 째 요일: "+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));//이 달의 몇 째 요일: 2		
		
		out.println("오전_오후(0:오전, 1:오후): "+today.get(Calendar.AM_PM));//오전_오후(0:오전, 1:오후): 0
		
		out.println("시간(0~11): "+today.get(Calendar.HOUR)); //시간(0~11): 11
		out.println("시간(0~23): "+ today.get(Calendar.HOUR_OF_DAY));//시간(0~23): 11
	
		out.println("분(0~59) : "+ today.get(Calendar.MINUTE));//분(0~59) : 37				

		out.println("초(0~59) : "+ today.get(Calendar.SECOND));//초(0~59) : 8

		out.println("1000분의 1초(0~999) : "+ today.get(Calendar.MILLISECOND));//1000분의 1초(0~999) : 53
		
		// 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60초)
		System.out.println("TimeZone(-12~+12): " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		
		System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE) ); // 이 달의 마지막 일을 찾는다.
	
		
	}

	

}
