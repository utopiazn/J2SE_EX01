package feb08;

import static java.lang.System.out;

public class FinallyEx1 {
	
	public static void main(String[] args){
		
		int [] var = {10,200,30};
		
		for(int i =0; i <=3; i++){
			
			try{ // exceotion가 발생 가능한 문장들
				out.println((i+1)+"번째");
				out.println("var["+i+"] : "+var[i]);
				out.println("~~~~~~~~~~~~~");
				
			}catch(ArrayIndexOutOfBoundsException ex){ // 배열 호출 오류시 
				out.println("배열을 넘었습니다.");
				return;
			}finally{ // exception발생 여부와 상관없이 수행할 문장들;
				out.println(":::::::::::finally:::::::::::::::");
			}
			
			
		}
		
		
		out.println("프로그램 끝!");
		
	}

}

/*
1번째
var[0] : 10
~~~~~~~~~~~~~
:::::::::::finally:::::::::::::::
2번째
var[1] : 200
~~~~~~~~~~~~~
:::::::::::finally:::::::::::::::
3번째
var[2] : 30
~~~~~~~~~~~~~
:::::::::::finally:::::::::::::::
4번째
배열을 넘었습니다.
:::::::::::finally:::::::::::::::




*/