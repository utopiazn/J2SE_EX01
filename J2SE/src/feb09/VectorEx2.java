package feb09;

import java.util.Vector;
import static java.lang.System.out;

public class VectorEx2 {
	
	public static void main(String[] args){
		
		Vector<Double>v = new Vector<Double>(2,5);
		
		//자원추가.
		v.add(100.3);//0
		v.add(3.14); // 1
		v.add(1000.);// 2
		
		for(Double n : v){
			out.println(n); // 추가된 요소들 출력
		}
		
		//자원검색		
		double search = 1000.0; // 검색할 요소
		int index = v.indexOf(search); // 검색 //2
		
		if(index != -1)
			out.println("검색요소"+search+"의 위치"+index);
		else
			out.println("검색요소"+search+"가 없습니다.");
			
		out.println("\n:::::삭제 전 용량/크기 확인::::::");	
		out.println("검색용소"+v.capacity()); // 배열의 실제 공간 수 : 7
		out.println("size : "+ v.size()); //3
		
		//자원 삭제
		
		double del = 3.14; // 삭제할 요소
		
		if(v.contains(del)){ // 삭제할 요소가 Vector의 요소인지 검사
			v.remove(del); //삭제	
			out.println(del+"삭제 완료!");			
		}
		
		
		out.println("\n:::::삭제 후 용량/크기 확인:::::::::::::::::::");
		out.println("capacity:"+v.capacity()); //실제 배열 공간 수
		out.println("size :"+v.size());
		
		
		v.trimToSize(); // 용량을 현재 요소의 수 크기로 설정;
		

		
		out.println("\n::::::용량조절 후  용량/크기 확인:::::::::::::::::::");
		out.println("capacity:"+v.capacity()); //실제 배열 공간 수
		out.println("size :"+v.size());
		
				
		
	}

}


/*
100.3
3.14
1000.0
검색요소1000.0의 위치2

:::::삭제 전 용량/크기 확인::::::
검색용소7
size : 3
3.14삭제 완료!

:::::삭제 후 용량/크기 확인:::::::::::::::::::
capacity:7
size :2

::::::용량조절 후  용량/크기 확인:::::::::::::::::::
capacity:2
size :2

*/


