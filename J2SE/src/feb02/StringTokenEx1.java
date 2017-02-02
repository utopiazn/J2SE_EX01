package feb02;

import java.util.StringTokenizer;


public class StringTokenEx1 {
	
	StringTokenizer st;
	
	
	public StringTokenEx1(String str){
		System.out.println("str : "+str);
		st = new StringTokenizer(str);
	}
	
	public StringTokenEx1(String str, String delim){
		System.out.println("str : "+str);
		st = new StringTokenizer(str, delim);
		
	}
	
	
	public void print(){		
		
		System.out.println("str :"+ st.countTokens());
		
		while(st.hasMoreElements()){  // 수차적으로 데이터 체크
			String token= st.nextToken();
			System.out.println(token);			
		}
		System.out.println("--------------------------------------------");
	}
	
	
	public static void main(String[] args){
		
		StringTokenEx1 st1 = new StringTokenEx1("Happy day");
		st1.print();
		
		StringTokenEx1 st2 = new StringTokenEx1("2017/02/02","/");
		st2.print();
		
		
	}

}
