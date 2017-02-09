package feb09;

import java.util.*;

public class HashSetEx2 {

	
	
	public static void main(String[] args){
		
		Object[] objArr = {"12",new Integer(100),"1","2","3","3","2","1","4","5"};
		
		
		
		/*
		 * HashSet : 순서가 전혀 필요 없는 데이터를 해시 테이블에 저장한다. Set 중에 가장 성능이 좋다.




			TreeSet : 저장된 데이터의 값에 따라서 정렬되는 셋이다. red-black이라는 트리 타입으로 값이 저장되며, 
			HashSet 보다 약간 성능이 느리다.




			LinkedHashSet : 연결된 목록 타입으로 구현된 해시 테이블에 데이터를 저장한다. 저장된 순서에 따라서 값이 정렬된다. 
			대신 성능이 이 셋 중에서 가장 나쁘다.



		 */
		
		
		/*
		Set은 순서에 상관 없이, 어떤 데이터가 존재하는지를 확인하기 위한 용도로 많이 사용된다. 
		다시말해서 중복되는 것을 방지하고, 원하는 값이 포함되어 있는지를 확인하는 것이 주 용도이다.
		 */
		
		// HashSet대신 LinkedHashSet을 사용한다. //연결된 목록 타입으로 구현된 해시 테이블에 데이터를 저장한다. 
											//저장된 순서에 따라서 값이 정렬된다. 대신 성능이 나쁘다.

		Set<Object> set = new LinkedHashSet<Object>();  
				
		for(int i=0; i<objArr.length;i++){
			set.add(objArr[i]);
		}
		
		System.out.println(set);
		
	}
}

//http://learning-image.com/220486579762  (참조)

/*
[1, 1, 2, 3, 4]


*/

