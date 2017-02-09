package feb09;

import java.util.*;
import static java.lang.System.out;


public class IteratorEx1 {
	
	public static void main(String[] args){
		
		Vector<String> v = new Vector<String>(2,5);
		
		v.add("혜리");
		v.add("수지");		
		v.add("설현");
		
		out.println("백터크기:"+ v.size());
		
		Iterator<String> it = v.iterator(); //Iterator얻기
		
		
		
		while(it.hasNext()){
			out.println(it.next()); //다음
			it.remove();
		}
		
		
		out.println("백터크기:"+ v.size());
		
	}

}

/*
백터크기:3
혜리
수지
설현
백터크기:0
*/