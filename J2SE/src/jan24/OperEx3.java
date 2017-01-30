package jan24;

//대입 연산자
// a+=3   ====> a = a+3
public class OperEx3 {
	
	static void  getPrintf(int a){
		
		System.out.println("변수 a:"+a); //10
		
	}
	

	public static void main(String[] args){
		int a = 10;
		int b=7;
		
		System.out.println(a+b); // 17
		
		getPrintf(a);  //10
		
		
		System.out.println(a+=b);  // a= a+b    a = 10 +7  = 17
		getPrintf(a);  //17
				
		System.out.println(a-=b);  // a= a-b  a=  17-7 = 10
		getPrintf(a);
		
		System.out.println(a*=b); 
		getPrintf(a);  //70
		

		System.out.println(a/=b); 
		getPrintf(a); // 10
		
		System.out.println(a%=b); 
		getPrintf(a); //3
		
		
	}
}
