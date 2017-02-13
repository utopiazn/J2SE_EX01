package feb13;

import java.util.Calendar;
import java.util.Date;
import java.sql.Timestamp;

import static java.lang.System.out;

public class CalenderEx1 {
	
	public static void main(String[] args){
		
		StringBuffer sb = new StringBuffer("년중 ");
		Calendar now  = Calendar.getInstance();
		
		
		
		out.println(now);
		//java.util.GregorianCalendar
		//[time=1486946259976,areFieldsSet=true,areAllFieldsSet=true,
		//lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
		//offset=32400000,dstSavings=0,useDaylight=false,transitions=22,
		//lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
		//YEAR=2017,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,
		//DAY_OF_YEAR=44,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,
		//HOUR_OF_DAY=9,MINUTE=37,SECOND=39,MILLISECOND=976,
		//ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		
		out.println(new Date());
		//Mon Feb 13 09:43:21 KST 2017
		
		out.println(System.currentTimeMillis());
		//1486946650732
		
		out.println(new Timestamp(System.currentTimeMillis()));
		//2017-02-13 09:50:32.793
		
		
		int week_yy = now.get(now.WEEK_OF_YEAR);  //1월달 부터 현재 까지 주단위
		out.println( week_yy);  //7
			
		int yy = now.get(now.YEAR);  // 현재 연도
		out.println( yy);  //2017
		
		int mm = now.get(now.MONTH)+1; // 1월을 0을 기억한다.
		out.println(mm); //2
		
		int dd = now.get(now.DAY_OF_MONTH);
		out.println(dd); // 13
		

		sb.append(week_yy);
		sb.append("주째인 ");
		sb.append(yy);
		sb.append("년 ");
		sb.append(mm);
		sb.append("월 ");
		sb.append(dd);
		sb.append("일");
		
		out.println(sb.toString());
		//년중 7주째인 2017년 2월 13일
		

	}

}
