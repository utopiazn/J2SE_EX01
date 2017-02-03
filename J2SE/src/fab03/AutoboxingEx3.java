package fab03;

public class AutoboxingEx3 {
	
	public static void main(String[] args){
		
	
		Integer[] var = {new Integer(100),
						200,
						300			
						};
		
		for(int i : var) // 언박싱
			System.out.println(i);
	}

}
