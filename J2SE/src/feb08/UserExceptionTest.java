package feb08;

import static java.lang.System.out;

public class UserExceptionTest {
	
	public void test1(String[] n) throws UserException{
	
		out.println("Test1");
		
		if(n.length<1){
			throw new UserException("아무것도 없다네");
		}else{
			throw new UserException("최종 예선",703);
		}
		
		
	}
	
	
	public static void main(String[] args){
		
		UserExceptionTest ut = new UserExceptionTest();
		
		try{
			ut.test1(args);
			
		}catch(UserException ue){
			ue.printStackTrace();
			
		}
	}

}

/*결과

Test1
feb08.UserException: 아무것도 없다네
	at feb08.UserExceptionTest.test1(UserExceptionTest.java:12)
	at feb08.UserExceptionTest.main(UserExceptionTest.java:26)

*/