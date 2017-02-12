package feb09;

import java.util.*;

public class TreeSetEx2 {

	public static void main(String[] args){
		TreeSet set = new TreeSet();
		int[] score = {85,95,50,35,45,65,10,100,50};
		
		for(int i=0; i<score.length;i++){
			set.add(new Integer(score[i]));		
			
		}
		
		
		for(int i: score)
			System.out.print(i+ ",");
		
		//85,95,50,35,45,65,10,100,50,
		
		
		System.out.println("\n50보다 작은 값"+set.headSet(new Integer(50)));
		//50보다 작은 값[10, 35, 45]
		System.out.println("50보다 큰 값"+set.tailSet(new Integer(50)));
		//50보다 큰 값[50, 65, 85, 95, 100]

	}
}
