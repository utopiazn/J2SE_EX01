package feb13_etc;

import java.util.*;
import static java.lang.System.out;

public class RandomEx1 {
	
	static int  i =1;
	
	static void randomPrint(int n){
		Random rand  = new Random(n);
		
		out.println("= rand"+ i++ +"=");
		
		for(int i=0;i<5;i++){
			out.println(i+":"+rand.nextInt());
		}
		out.println();
	}
	
	public static void main(String[] args){
		
		randomPrint(1);

		randomPrint(2);
		
		//Random(1)  같은 1이면 램덤 값이 같음.
		//Random rand  = new Random(1);
		//Random rand2 = new Random(1);
		
		//Random rand  = new Random(1);
		//Random rand2 = new Random(2);
		/*		
		
		out.println("= rand =");
		
		for(int i=0;i<5;i++){
			out.println(i+":"+rand.nextInt());
		}
		
		out.println();
		
		out.println("= rand2 =");
		for(int i =0; i<5 ; i++){
			out.println(i+":"+rand2.nextInt());
		}
		*/
	}

}
