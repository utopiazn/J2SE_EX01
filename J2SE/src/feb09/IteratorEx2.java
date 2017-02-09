package feb09;

import java.util.*;
import static java.lang.System.out;

public class IteratorEx2 {

	public static void main(String[] args){
		
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);		
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0; i<10;i++){
			
			original.add(i+"");
			
		}
		
		Iterator it = original.iterator();
		
	
		
		while(it.hasNext()){
			copy1.add(it.next());
		}
		
		out.println("= Original에서 copy1로 복사(copy) =");
		out.println("Original :"+original);
		out.println("copy1 :"+copy1);
		out.println();
		
		it = original.iterator();
		
		while(it.hasNext()){
			
			copy2.add(it.next());
			it.remove();
		}
		
		out.println("= Original에서 copy2로 이동(move) =");
		out.println("original:"+original);
		out.println("copy2:"+copy2);
		
		
		
	}
	
	
}
/*

= Original에서 copy1로 복사(copy) =
Original :[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
copy1 :[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

= Original에서 copy2로 이동(move) =
original:[]
copy2:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


*/