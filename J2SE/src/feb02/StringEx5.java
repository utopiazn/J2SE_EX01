package feb02;

public class StringEx5 {
	
	public static void main(String[] args){
		
		String s1 = "Kwon Sun Ae";
		          // 012345678910
		int index = s1.indexOf('n'); //3
		System.out.println("맨처음 문자 n의 위치"+  index);
		
		index = s1.indexOf("Sun"); //5  <---S의 위치 indx를 가져옴		
		System.out.println("문자 Sun 의 위치"+  index);
		
		index = s1.lastIndexOf('n'); //7
		System.out.println("마지막 문자 n의 위치"+ index);
		
		
		char c = s1.charAt(index); //index 7번째 값 문자 n 추출 
		System.out.println("추출한 문자 : "+c);
		
		
		//String s1 = "Kwon Sun Ae";
        			// 012345678910

		index = s1.indexOf('S'); //5
		String str = s1.substring(index); // Sun Ae
		System.out.println("대문자 S로 부터 끝까지 잘라내기" +str);
		
		str = s1.substring(index, index+3); //sun
		System.out.println("대문자  S로부터 3자까지 잘라내기"+str);
		
		int length = s1.length();
		System.out.println("s1의 길이 :"+ length);
		
		String[] arr = s1.split(" "); // 구분자로 나누어 배열에 집어  넣기
		
		for(int i=0; i < arr.length; i++){
			System.out.println("arr[" + i + "] :" + arr[i]);
		}
		
	}

}
