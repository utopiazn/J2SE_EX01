package feb13_etc;

import java.util.Date;
import java.text.SimpleDateFormat;

import static java.lang.System.out;



public class DateFormatEx1 {
	
	static void simpleDateFormat(String  str){
	
		Date today = new Date();
		
		SimpleDateFormat sdf = new  SimpleDateFormat(str);
		
		
		out.println(sdf.format(today));
	}
	

	public static void main(String[] args){
		
		simpleDateFormat("yyy-MM-dd"); 				  	// 2017-02-13		
		simpleDateFormat("''yy년 MMM dd일 E요일"); 		  	// '17년 2월 13일 월요일
		simpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");  	// 2017-02-13 14:43:32.777
		simpleDateFormat("yyyy-MM-dd hh:mm:ss a"); 	  	// 2017-02-13 02:44:40 오후
		
		out.println();
		
		simpleDateFormat("오늘은 올 해의 D번째 날입니다."); 	  	// 오늘은 올 해의 44번째 날입니다.
		simpleDateFormat("오늘은 이 달의 d번째 날입니다"); 		// 오늘은 이 달의 13번째 날입니다
		simpleDateFormat("오늘은 올 해의 w번째 주입니다.");   	// 오늘은 올 해의 7번째 주입니다.
		simpleDateFormat("오늘은 이 달의 W번째 주입니다."); 		// 오늘은 이 달의 3번째 주입니다.
		simpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");   // 오늘은 이 달의 2번째 월요일입니다.
		
		
		
	}

}
/*
2017-02-13
'17년 2월 13일 월요일
2017-02-13 14:50:25.107
2017-02-13 02:50:25 오후

오늘은 올 해의 44번째 날입니다.
오늘은 이 달의 13번째 날입니다
오늘은 올 해의 7번째 주입니다.
오늘은 이 달의 3번째 주입니다.
오늘은 이 달의 2번째 월요일입니다.

*/