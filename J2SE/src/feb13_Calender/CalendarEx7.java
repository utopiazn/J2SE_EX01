package feb13_Calender;

import java.util.*;
import static java.lang.System.out;


public class CalendarEx7 {
	
	public static void main(String[] args){
		
		if(args.length !=2){
			System.out.println("Usage : java CalendarEx7 2017 2");
			return ;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 끝일
		
		
		// 월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야한다.
		//예룰 들어 2004년 11월 1일은  sDsay.set(2004,10,1);과 같이 해줘야한다.
		sDay.set(year, month-1,1);  // 입력 월의 1일로 설정한다.		
		out.println(toString(sDay)); //2017년 1월 1일

		
		
		// 입력월의 말일르 설정한다.
		eDay.set(year, month-1,sDay.getActualMaximum(Calendar.DATE));
		out.println(toString(eDay)); //2017년 1월 31일

	
	
		// 1일이 속한 주의 일요일로 날짜 설정
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK)+1);
		out.println(toString(sDay)); //2017년 1월 1일
		
		// 말일이 속한 주의 토요일 날짜 설정
		eDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK));
		
		out.println("\n"); 
		out.println("      " + year +"년 " + month +"월"); 
		out.println(" SU MO TU WE TH FR SA"); 
		
		
		
		//시작일과 마지막일가지; (sDay <=eDay) 1일씩 증가시면서 일(Calendar.Date)을 출력한다.
		
		for(int n=1;sDay.before(eDay)|| sDay.equals(eDay); sDay.add(Calendar.DATE, 1)){
			
			int day = sDay.get(Calendar.DATE);
			out.print( (day<10)? "  "+day : " "+day );
			
			if(n++%7==0) // 7일을 찍고 줄을 바꾼다.
				out.println();  
		}
		
	
		
	}
	
	private static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR) +"년 "+
				(date.get(Calendar.MONTH)+1) +"월 "+
				date.get(Calendar.DATE) + "일" 
				;
	}

}
