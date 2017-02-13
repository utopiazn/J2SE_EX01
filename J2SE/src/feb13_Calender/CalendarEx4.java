package feb13_Calender;

import java.util.*;
import static java.lang.System.out;

public class CalendarEx4 {

	public static void main(String[] args){
		
		int itime[] = { 2017, 2, 13};
		
		Calendar date = Calendar.getInstance();
		
		date.set(itime[0],itime[1],itime[2]);  // 2017년 2월 13일		
		out.println(toString(date)); //2017년 2월 13일 

		date.set(itime[0],itime[1],itime[2]);   // 2017년 2월 13일	
		out.println("======1일 후===============");
		date.add(Calendar.DATE, 1);
		out.println(toString(date));//2017년 2월 14일 
		
		date.set(itime[0],itime[1],itime[2]);   // 2017년 2월 13일	
		out.println("======6 달전===============");
		date.add(Calendar.MONTH, -6);
		out.println(toString(date));//2016년 9월 14일  
		
		date.set(itime[0],itime[1],itime[2]);   // 2017년 2월 13일	
		out.println("======31일 후(roll)========");
		date.roll(Calendar.DATE, 31);
		out.println(toString(date));//2016년 9월 15일 
		
		date.set(itime[0],itime[1],itime[2]);   // 2017년 2월 13일	
		out.println("======31일 후(add)========");
		date.add(Calendar.DATE, 31);
		out.println(toString(date));//2016년 9월 15일 
		
		
	}

	private static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR) +"년 "+	
			   (date.get(Calendar.MONTH) +1)+"월 "+	
			   date.get(Calendar.DATE)+"일 ";	
				
				
	}
	
}
