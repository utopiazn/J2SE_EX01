package jan31;

class Data {
	
	int x;
	
	static void change(int x){  // �⺻�� �Ű� ����
		x=1000; //  �޼��� ����   ������   this.x �� ����Ұ�� ���� ������.
		System.out.println("charge() : x = " + x); //1000
	}
		
	
}


public class ParameterTest {
	
	public static void main(String[] args){
	
		Data d = new Data(); // ��ü ����
		
		d.x = 10;
		
		System.out.println("main(): x =" + d.x); // 10
		
		Data.change(d.x);
		System.out.println("After charnge(d.x)");
		System.out.println("main() : x = " + d.x);
		
		
	}

}
