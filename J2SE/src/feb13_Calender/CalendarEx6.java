package feb13_Calender;

import java.util.*;
import static java.lang.System.out;

public class CalendarEx6 {

	public static void main(String[] args){
		
		if(args.length != 2){
			
			out.println("Usage : java CalendarEx6 2017 2");
			return ;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		int START_DAY_OF_WEEK =0;
		int END_DAY =0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		// 월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야한다.
		//예룰 들어 2004년 11월 1일은  sDsay.set(2004,10,1);과 같이 해줘야한다.
		
		sDay.set(year,month-1,1);
		eDay.set(year,month-1,1);
		
		// 다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 된다.
		// 12월 1일에서 하루를 빼면 11월 30일이 된다.
		eDay.add(Calendar.DATE,-1);
		
		// 첫 번재 요일이 무슨 요일인지 알나 낸다.
		START_DAY_OF_WEEK= sDay.get(Calendar.DAY_OF_WEEK);
		
		//eDay에 지정된 날짜를 얻어온다.
		END_DAY = eDay.get(Calendar.DATE);
		
		out.println("      " + args[0]+ "년 "+ args[1] + "월");
		out.println(" SU MO TU WE TH ER SA");
		
		// 해당 월 1일이 어느 요일인지에 따라 고백을 출력한다.
		// 만일 1일이 수요일이랑면 공백을 세번 찍는다 (일요일 부터 시작
		
		for(int i =1; i<START_DAY_OF_WEEK; i++){
			 out.print("   ");
		}
		
		for(int i=1, n =START_DAY_OF_WEEK; i <=END_DAY;i++,n++){
		
			out.print( (i<10)? "  " + i :" " +i);			
			if(n%7 ==0)
				out.println();
		}
		
		
	}
}
