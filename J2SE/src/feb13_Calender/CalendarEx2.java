package feb13_Calender;

import java.util.*;


public class CalendarEx2 {
	
	public static void main(String[] args){
		
		// 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워 두었다.
		
		final String[] DAY_OF_WEEK = {"","월","화","수","목","금","토","일"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//month의 경우 0 부터 시작하기 때문에 8원인 경우  7로 저장된다.
		//date1.set(2017,Calendar.FEBRUARY,13);
		date1.set(1971, 0, 27); // 1971년 1월 27일로 날짜를 설정한다.
		System.out.println("date1은 "+ toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고,");
		System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");

		
		// 두 시간의 차이를 얻으려면, getTimeInMillis()을 이용해서 천분의 1초 다위로 변환 해야한다.
		long differance = (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println("그 날(date1)부터 지금(date2)까지 "+ differance + "초가 지났습니다.");
		System.out.println(""+differance/(24*60*60)+"일 입니다.");
	}

	private static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR)+"년 "+ 
				(date.get(Calendar.MONTH)+1) + "월 " + 
				date.get(Calendar.DATE) + "일 ";
	}



}
