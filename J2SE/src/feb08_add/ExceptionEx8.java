package feb08_add;

public class ExceptionEx8 {
	
	public static void main(String[] args){
		
		try{
			throw new Exception();  //강제로 발생시킴.
		}catch(Exception e){
			System.out.println("Exception이 발생 했습니다./");
		}
		
	}

}

/*  결과
Exception이 발생 했습니다.
*/