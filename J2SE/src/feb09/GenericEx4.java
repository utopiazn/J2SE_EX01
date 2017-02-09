package feb09;

import static java.lang.System.out;

public class GenericEx4<T> {
	
	T v;
	
	public GenericEx4(T n){
		v = n;
	}
	
	public void set(T n){
		v = n ;
	}
	
	public T get(){		
		
		return v;
	}
	
	public static void main(String[] args){
		
		GenEx3 g3 = new GenEx3();
		
		//<GenEx2 보다 상위 클래스만 사용>
		GenericEx4<? super GenEx2> g4 =
				new GenericEx4<GenEx1>(g3);
		
		GenEx3 test = (GenEx3)g4.get();		
		//GenEx3 test1 = g4.get(); // 오류 클래스 변환 필요
		
		out.println("g4의 결과"+test.msg+" , "+ test.getMsg());		
	}
}
/*
g4의 결과GenEx3 , GenEx3
*/