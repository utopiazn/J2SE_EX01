package feb09;

import java.util.Stack;
import static java.lang.System.out;

public class StackEx1 {
	
	public static void main(String[] args){
		
		String[] groupA = {"우즈베키스탄","쿠웨이트","사우디","대한민국"};
		
		Stack<String> stack = new Stack<String>();
		
		
		out.println("입력");
		
		int i = 1;
		for(String n : groupA){
			stack.push(n); //입력	
			
			out.println( i++ + " : "+n);
		}
		
		out.println("----------------\n출력");
		
		while(!stack.isEmpty()){
			out.println( --i + " : "+ stack.pop()); // 가져오기
		}
	}

}
