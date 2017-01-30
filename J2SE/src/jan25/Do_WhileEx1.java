package jan25;

public class Do_WhileEx1 {

	public static void main(String[] args){
		
		int su =15;
		String str = "Java DoublePlus";
		
		do{
			System.out.println("dowhile" + str);
		}while(su-- >10);  //(주의) semicolon생략시 오류!!
		
		while(su-- >10){
			System.out.println(str);
		}
			
	}
}
