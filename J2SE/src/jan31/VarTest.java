package jan31;

//Variable Arguments
public class VarTest {
	//argTest()
	//argTest(String n)
	//argTest(String n,String n1)
	
	public void argTest(String ...n){  // �Ű������� ������ ���� ������ ���� �ʴ´�.
		
		for(int i = 0; i<n.length; i++){
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println("----------------------------------");
		
	}
	
	
	public void argTest2(int n1,int n2,int n3,  String ...n){  // �Ű������� ������ ���� ������ ���� �ʴ´�. or   �ٸ� ���ڸ� ������ ������ �տ��� ������ ����
		
		for(int i = 0; i<n.length; i++){
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println("----------------------------------");
		
	}

	
	public static void main(String[] args){
		
		VarTest vt = new VarTest(); //��ü ����
		vt.argTest("arargs","Test");
		
		vt.argTest("100","600","900","1000");
		vt.argTest();
		
		
	}

}
