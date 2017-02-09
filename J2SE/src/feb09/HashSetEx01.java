package feb09;

import java.util.*;

public class HashSetEx01 {

	public static void main(String[] args){
		
		
		 
		Object[] objArr = {"12",new Integer(100),"1","2","3","3","2","1","4","5"};
		
		Set<Object> set = new HashSet<Object>();
		
		
		for(int i=0; i<objArr.length; i++){
			set.add(objArr[i]); //HashSet에 objArr의 요소들을 저장한다.
		}
		
		System.out.println(set); // HashSet에 저장된 요소들을 출력한다.
		
	/*	for(Object i : set){
			System.out.print(i);
		}
		*/
	}
}

/* 결과
[12, 1, 2, 3, 100, 4, 5]

*/