package jan31;

//Variable Arguments
public class VarTest {
	//argTest()
	//argTest(String n)
	//argTest(String n,String n1)
	
	public void argTest(String ...n){  // 매개변수의 갯수에 대한 제한을 두지 않는다.
		
		for(int i = 0; i<n.length; i++){
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println("----------------------------------");
		
	}
	
	
	public void argTest2(int n1,int n2,int n3,  String ...n){  // 매개변수의 갯수에 대한 제한을 두지 않는다. or   다른 인자를 받으룻 없지만 앞에는 받을수 잇음
		
		for(int i = 0; i<n.length; i++){
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println("----------------------------------");
		
	}

	
	public static void main(String[] args){
		
		VarTest vt = new VarTest(); //객체 생성
		vt.argTest("arargs","Test");
		
		vt.argTest("100","600","900","1000");
		vt.argTest();
		
		
	}

}
