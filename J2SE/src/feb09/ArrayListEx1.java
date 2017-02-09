package feb09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.lang.System.out;


public class ArrayListEx1 {
	
	public static void main(String[] args){
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		
		list1.add(new Integer(5));//0
		list1.add(new Integer(4));//1
		list1.add(new Integer(2));//2
		list1.add(new Integer(0));//3
		list1.add(new Integer(1));//4
		list1.add(new Integer(3));//5
		
		//list1.get(0);

		ArrayList list2 = new ArrayList(list1.subList(1, 4));  //4,2,0
		
		print(list1,list2);	//list1:[5, 4, 2, 0, 1, 3]
							//list2:[4, 2, 0]
		
		
		// list1,list2 를 정렬
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1,list2); //list1:[0, 1, 2, 3, 4, 5]
							//list2:[0, 2, 4]

		
		out.println("list1.containsAll(list2):"+list1.containsAll(list2)+"\n"); //true
		
		//4,2,0,AA,B,C
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1, list2);
		
		//list2:[0, 2, 4, A, B, C]
		//out.println("list2:"+list2);
		
		list2.set(3, "AA");//list2:[0, 2, 4, AA, B, C]		
		
		print(list1,list2); // list1:[0, 1, 2, 3, 4, 5]
							// list2:[0, 2, 4, A, B, C]
		
		
		
		// list1에서 listt2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("교집합 :list1.retainAll(list2) :"+list1.retainAll(list2)); //trye
		print(list1,list2);// list1:[0, 2, 4]
						   // list2:[0, 2, 4, AA, B, C]

		
		
		// list2 에서 list1에 포함된 객체들을 삭제한다.		
		for(int i=list2.size()-1; i >=0;i--){
			
			if( list1.contains( list2.get(i) ) ) //list1에서 list2에 들어 잇는 문자 찾기.
					list2.remove(i); // 삭제
					
	
		}
		
		
		
		print(list1,list2);
		//list1:[0, 2, 4]
		//list2:[AA, B, C]
		
		
		
	}
	
	static void print(ArrayList list1,ArrayList list2){
		
		out.println("list1:"+list1);
		out.println("list2:"+list2);
		out.println("\n");
		
	}

}
