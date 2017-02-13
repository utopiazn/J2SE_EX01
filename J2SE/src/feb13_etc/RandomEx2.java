package feb13_etc;

import java.util.*;
import static java.lang.System.out;

public class RandomEx2 {

	public static void main(String[] args){
		
		Random rand   = new Random();
		int[] number  = new int[100];
		int[] counter = new int[10];
		
		for(int i =0; i< number.length;i++){			
			//out.print(number[i] =(int)(Math.random()*10));
			// 0<=x10 범위의 정수 반환
			out.print(number[i]=rand.nextInt(10));
		}
		out.println();
		
		for(int i =0; i< number.length; i++ ){
			counter[number[i]]++;
		}
		for(int i=0;i<counter.length;i++){
			out.println(i+"의 개수"+printGraph('*',counter[i]) + " " + counter[i]); 
		}
		
		
		
		
	}
	
	public static String printGraph(char ch,int value){
		
		char[] bar = new char[value];
		
		for(int i=0; i< bar.length; i++){
			
			bar[i] = ch;
		}
		
		
		return new String(bar);
	}
}
