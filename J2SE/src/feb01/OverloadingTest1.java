package feb01;


// overloading �ƴ�
public class OverloadingTest1 {
	
	public void intLength(int a){
		String s = String.valueOf(a); // Ŭ������,�޼ҵ��
		stringLength(s);
		//System.out.println("�Է��� ���� ����"+s.length());
	}
	
	public void floatLength(float f){
		String s = String.valueOf(f);
		System.out.println("�Է��� ���� ����"+s.length());
		
	}
	
	public void stringLength(String str){
		System.out.println("�Է��� ���� ����"+ str.length());
	}
	
	public static void main(String[] args){
		
		OverloadingTest1 ot1 = new OverloadingTest1(); //��ü ����
		
		ot1.intLength(1000);
		ot1.floatLength(3.14f);
		ot1.stringLength("10000");
		
		
		
	}

}

/*
 * OverloadingTest1
 * ==================
 * intLength,floatLength,stringLength
 * 
 * 
 * 
 * 
 */
