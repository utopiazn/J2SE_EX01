package feb01.Static;


// static  먼저 실행 되고  그다음 main 이실행됨.
public class StaticTest4 {
	
	static{
		System.out.println("Static init1");
	}
	
	static{
		System.out.println("Static init2");
	}
	
	static String s = echo("String");
	

	
	
	static String echo(String s){
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args){
		System.out.println("main");
		StaticTest4 st4 = new StaticTest4();
	}
	

}
