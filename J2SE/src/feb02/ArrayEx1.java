package feb02;

public class ArrayEx1 {
	public static void main(String[] args){
		char[] ch = new char[5];
		
		for(int i=0 ; i<5; i++){
			ch[i] = (char)(i+65);
		}
		
		for(int i=0; i<ch.length; i++){
			
			System.out.println("ch["+i+"]:"+ch[i]);
		}
	}

}

/*
결과
ch[0]:A
ch[1]:B
ch[2]:C
ch[3]:D
ch[4]:E
*/