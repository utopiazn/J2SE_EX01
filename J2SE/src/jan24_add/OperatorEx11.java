package jan24_add;

public class OperatorEx11 {

	public static void main(String[] args){
		
		long a = 1000000 * 1000000;   // 계산 결과 int형
		long b = 1000000 * 1000000L;  // long형 리터널
		
		System.out.println(a);
		System.out.println(b);
	}
}

/*
 * 정수형
int	4byte	0	-2,147,483,648 ~ 2,147,483,647
* 정수형
long	8byte	0	-9,223,372,036,854,775,808
					~ 9,223,372,036,854,775,807

*/