package feb09;

import static java.lang.System.out;
public class GenericEx5<T> {
	
	T v;
	
	public GenericEx5(T n){
		v = n;
	}
	
	public void Set(T n){
		v = n;
	}
	
	public T get(){
		return v;
	}
	
	public static void main(String[] args){
		
		GenEx3 g3 = new GenEx3();
		
		//<genEx2를 상속 받은것만 사용>
		GenericEx5<? extends GenEx2> g5
			= new GenericEx5<GenEx3>(g3);
		
		GenEx2 test = g5.get();
		//GenEx3 test2 = g5.get(); // 오류
		
		out.println("g5의 결과 : "+test.msg+","+test.getMsg());
		
	}

}

/*
g5의 결과 : GenEx1,GenEx3
*/