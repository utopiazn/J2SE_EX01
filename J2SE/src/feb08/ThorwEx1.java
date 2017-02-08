package feb08;

import static java.lang.System.out;

public class ThorwEx1 {
	
	
	public void  methodA(String[] n) throws Exception{
		
		if(n.length>0){
			for(String s : n){
				out.println(s);
			}
				
		}else{
			throw new Exception("배열요소가 없습니다.");
		}			
	}
	
	public static void main(String[] args){
		
		ThorwEx1 te = new ThorwEx1();
		
		try{
			
			te.methodA(args);
			
		}catch(Exception e){
			//out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	

}

/* 결과
java.lang.Exception: 배열요소가 없습니다.
	at feb08.ThorwEx1.methodA(ThorwEx1.java:16)
	at feb08.ThorwEx1.main(ThorwEx1.java:26)



*/