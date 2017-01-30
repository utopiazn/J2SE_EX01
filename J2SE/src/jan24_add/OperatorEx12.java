package jan24_add;

public class OperatorEx12 {

	public static void main(String[] args){
	
		int a = 1000000 * (100000 / 1000000);   // int 형으로 반환 되어 100000 / 1000000   은 영으로 반환됨
	    int b = (1000000 / 100000) * 1000000;
	  
	    System.out.println(100000 / 1000000); 
	    
	    System.out.println(a); 
	    System.out.println(b); 
	}
}

/*
 * 정수형
int	4byte	0	-2,147,483,648 ~ 2,147,483,647
*/