package feb13_etc;

import java.util.*;
import java.text.*;
import static java.lang.System.out;

public class DateFormatEx2 {
	
	static Date date;
	static void simpleDateFormat(String str){
		
		SimpleDateFormat sdf = new SimpleDateFormat(str);
		out.println(sdf.format(date));
		
	}
	
	public static void main(String[] args){
		
		// Calendar와 Date간의 변환은 다음과 같이 한다.
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 2,30); // 20015년 3월 30일 - Month는 0~ 11의 범위를 갖는다
		
		date = cal.getTime();
		
		simpleDateFormat("yyyy-MM-dd"); 			 //2015-03-30
		simpleDateFormat("yy-MM-dd E요일");           //15-03-02 월요일
		simpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); //2015-03-30 15:03:39.591
		simpleDateFormat("yyyy-MM-dd hh:mm:ss a");   //2015-03-30 03:03:49 오후
	
		
		
	}

}
