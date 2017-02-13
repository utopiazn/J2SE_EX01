package feb13_Calender;

import java.util.*;

public class CalendarEx5 {
	public static void main(String[] args){
		
		Calendar date = Calendar.getInstance();
		
		int iTime[] = {2015,11,22};// 2015년 12월 31일
		
		
		date.set(iTime[0],iTime[1],iTime[2]);  // 2015년 12월31일			
		System.out.println(toString(date)); //2016년 1월31일
		
		
		
		date.roll(Calendar.MONTH, 1);		
		System.out.println(toString(date)); //2016년 1월31일
		
		
		date.set(iTime[0],iTime[1],iTime[2]);  // 2015년 12월31
		date.add(Calendar.MONTH, 1);		
		System.out.println(toString(date)); //2016년 1월31일

		
		
	}

	private static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR) +"년 "+
				(date.get(Calendar.MONTH)+1) +"월 "+
				date.get(Calendar.DATE) + "일" 
				;
	}

}
