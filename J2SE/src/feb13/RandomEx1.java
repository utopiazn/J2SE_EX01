package feb13;

import java.util.Random;
import static java.lang.System.out;

public class RandomEx1 {
	
	public static void main(String[] args){
		
		String[] lesson = {"Java Beg","JSP","XML&Java","EJB"};
		Random r1 = new Random();
		
		//0~4 까지 램덤값 반환;
		int index = r1.nextInt(4);
		
		out.println("선택 과목 :"+lesson[index]);
		
	}

}
