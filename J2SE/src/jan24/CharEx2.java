package jan24;

public class CharEx2 {
	public static void main(String[] args){
		
		char c = '\u0041'; // Unicode

		System.out.println("c의 \"값\" : \t" +c);
	
		
		
		System.out.println("\n\n");
		
		
		// 테스트
		
		char escape_a = '\"';
		char escape_t = '\t';			
		

		System.out.println(c);
		
		System.out.println("c의 \"값\" : \t" +c);		
		System.out.println("c의 "+ escape_a  +"값" +escape_a + " : " + escape_t +c);		
		
		
	}

}



/*
****escape 문자(리터럴문자)*****
\n === >줄바꿈                  

\r ===>맨앞으로
                          
\b ====>백스페이스
\\ ====>\
\' ====> '
\"====>"
\t ====>tab
*/



