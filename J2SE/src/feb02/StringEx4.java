package feb02;

public class StringEx4 {
	
	public static void main(String[] args){
		
		
		String s1 = "Kwon sun Ae";
		String s2 = new String("KWON SUN AE");
		String msg = null;
		String msg2 = "";
		
		if(s1.equals(s2)) // 객체간의 내용비교
			msg = "s1과 s2는 내용이 같다";
		else
			msg = "s1과 s2는 내용이 다르다";
		
		System.out.println(msg);
		
		if(s1.equalsIgnoreCase(s2))  //대소문자 구별없이 내용비교
			msg = "s1과 s2는 대/소문자 구별없이 같다.";
		else
			msg = "s1과 s2는 대/소문자 구별없이도 다르다.";
		
		 System.out.println(msg);
		 
		 // format형식에 맞춰 String 객체 생성
		 msg = String.format("%20s,%s",s1,s2);
		 
		 System.out.println("msg :"+msg);
		 
		
		
	}

}
