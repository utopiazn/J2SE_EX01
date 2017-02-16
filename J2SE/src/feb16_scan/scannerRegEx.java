package feb16_scan;
import java.util.*;

public class scannerRegEx {
	
	public static void main(String[] args){
		
		String str = "1 and 2  and  animal  and lion and tiger";
		Scanner scan = new Scanner(str);
	
		scan = scan.useDelimiter("\\s*and\\s*");  // and 앞뒤로 있는 0개 이상의 빈 공백을 의미한다.
		
		int firstToken = scan.nextInt();
		int secondToken = scan.nextInt();
		
		String thirdToken = scan.next();
		String fourthToken = scan.next();
		String fifthToken= scan.next();
		
		System.out.printf("%d,%d,%s,%s,%s",
						firstToken,
						secondToken,
						thirdToken,
						fourthToken,
						fifthToken);
		
		if(scan != null)
			scan.close();
		
	}

}


/*

1,2,animal,lion,tiger
*/