package feb09;

import static java.lang.System.out;
import java.util.Vector;

public class VectorEx1 {
	
	public static void main(String[] args){
		
		
		//					Vector<String>(초기 배열수,추가로 5개씩 증가.);
		Vector<String> v = new Vector<String>(2,5);
		
		out.println(":::::Vector생성시:::::");
		out.println("capacity :"+v.capacity()); //실제 배열의 공간 2
		out.println("size : "+v.size());  //배열의 값의 수  0
		
		//자원추가
		
		v.add("박지성");
		v.add("박주영");
		v.add("유상철");
		v.addElement("장조성");
		
		out.println("\n::::요소 추가후:::::");
		out.println("capacity :"+v.capacity()); //실제 배열의 공간 2
		out.println("size : "+v.size());  //배열의 값의 수  0
		
		//결과
		
		int i =0;
		for(String s: v){
		
			out.println( "["+i++ +"] =" + s);
		}
		
		
	}

}
/* 결과.

:::::Vector생성시:::::
capacity :2
size : 0

::::요소 추가후:::::
capacity :7
size : 4
[0] =박지성
[1] =박주영
[2] =유상철
[3] =장조성



*/