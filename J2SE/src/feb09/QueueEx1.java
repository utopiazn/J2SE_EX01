package feb09;

import java.util.*;
import static java.lang.System.out;

public class QueueEx1 {

	public static void main(String[] args){
		
		String[] item = {"소나타","렉스톤","제큐어"};
		
		LinkedList<String> q = new LinkedList<String>();
		
		
		out.println("입력");
		
		int i =0;
		for(String n : item){
			q.offer(n);
			out.println( i + " : "+ q.get(i++));
		}
		
		
		
		out.println("q의 크기 : "+ q.size()+ "\n");
		
		
		
		String data = "";
		
		i =0;
		
		while( (data = q.poll() ) != null){
			out.println(i++ + " : "+data+"삭제");
		}
				
		out.println("q의 크기:" + q.size());
				
	}
	
}

/*
입력
0 : 소나타
1 : 렉스톤
2 : 제큐어
q의 크기 : 3

0 : 소나타삭제
1 : 렉스톤삭제
2 : 제큐어삭제
q의 크기:0
*/