package feb09;

import java.util.*;

public class HashSetEx5 {
	
	
	
	public static void main(String[] args){
		
		HashSet<String> setA = new HashSet<String>();
		HashSet setB	= new HashSet();
		HashSet setHab 	= new HashSet();
		HashSet setKyo 	= new HashSet();
		HashSet setCha 	= new HashSet();
		
		
		
		for(int i =0;i<6;i++){
			setA.add(Integer.toString(i));
		}
		
		System.out.println("A = "+setA); //A = [0, 1, 2, 3, 4, 5]
		
		for(int i =4;i<9;i++){
			setB.add(Integer.toString(i));
		}
		System.out.println("B = "+setA); //B = [0, 1, 2, 3, 4, 5, 6, 7, 8]
		
		
		//교집합
		Iterator it = setB.iterator();
		
		while(it.hasNext())	{
			Object tmp = it.next();			
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}
		
		System.out.println("A ∩ B = "+setKyo);  // 한글 ㄷ을 누르고 한자키
		//A ∩ B = [4, 5]
		
		
		//차집합
		it =setA.iterator();
		while(it.hasNext()){
			setHab.add(it.next());
		}
		
		System.out.println("A ∪ B = "+setHab); // 한글 ㄷ을 누르고 한자키
		//A ∪ B = [0, 1, 2, 3, 4, 5]

		//작업중.
	}

}
