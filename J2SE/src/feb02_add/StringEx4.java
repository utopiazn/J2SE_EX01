package feb02_add;

public class StringEx4 {

	public static void main(String[] args){
		
		
		String[] words = {
				new String("aaa"),
				new String("bbb"),
				new String("ccc")
				};
		
		for(int i = 0; i< words.length; i++){
			
			System.out.println(i+1 + "번째: " + words[i]);
			
			if(words[i].equals("ccc")){
				System.out.println("words에서 equals메서드로 찾았습니다.");
			}
			if(words[i] == "ccc"){
				System.out.println("whords에서 == 연산자로 찾았습니다.");
			}
		}
		
		for(int i=0; i< words.length; i++){
			
			words[i] = words[i].intern();
			
		}
		
		System.out.println("\n<< String배열 words의 문자열을 intern메서드를 수행한후\n");
		
		for(int i = 0; i< words.length; i++){
			
			System.out.println(i+1 + "번째: " + words[i]);
			if(words[i].equals("ccc")){
				System.out.println("words에서 equals메서드로 찾았습니다.");
			}
			if(words[i] == "ccc"){
				System.out.println("whords에서 == 연산자로 찾았습니다.");
			}
		}
		
	}
	
}
/*
intern  ::  String  str = new String("aaa"), ->> String  str = "aaa"  변환함.

*/
