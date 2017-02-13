package feb13_Calender;

import java.util.Calendar;
import static java.lang.System.out;
public class CalendarEx3 {
	
	static void setTime(Calendar time,int hh,int mm,int ss){
		

		time.set(Calendar.HOUR_OF_DAY,hh);
		time.set(Calendar.MINUTE,mm);
		time.set(Calendar.SECOND,ss);
		
	}
	
	static void printTime(Calendar time){
		
		System.out.println(time.get(Calendar.HOUR_OF_DAY)+"시 " +
							time.get(Calendar.MINUTE) +"분 " +
							time.get(Calendar.SECOND) + "초");
		
	}

	public static void main(String[] args){
		final int[] TIME_UNIT = {3600,60,1};//큰 당위를 앞에 높는다.
		final String[] TIME_UNIT_NAME = {"시간","분","초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		
		// time1의 시간을 10시 20분 30초로  설정한다.
		//time1.set(Calendar.HOUR_OF_DAY,10);
		//time1.set(Calendar.MINUTE,20);
		//time1.set(Calendar.SECOND,30);		
		setTime(time1,10,20,30);
		
		// time2의 시간을 20시 30분 10초로 설정한다.		
		//time2.set(Calendar.HOUR_OF_DAY,20);
		//time2.set(Calendar.MINUTE,30);
		//time2.set(Calendar.SECOND,10);
		setTime(time2,20,30,10);
		
		
		printTime(time1);//10시 20분 30초
		printTime(time2);//20시 30분 10초

		
		long difference = Math.abs(time2.getTimeInMillis() -time1.getTimeInMillis())/1000;
		
		out.println("time1 과 time2 의 차이는 "+difference+"초 입니다.");
		//time1 과 time2 의 차이는 36580초 입니다.
		String tmp = "";
				
		for(int i =0; i<TIME_UNIT.length;i++){
			tmp += difference/TIME_UNIT[i]+TIME_UNIT_NAME[i];
			difference %= TIME_UNIT[i];
		}
		
		out.println("시분초로 변환 하면 "+tmp+"입니다.");
		//시분초로 변환 하면 10시간9분40초입니다.
		


	}
}



