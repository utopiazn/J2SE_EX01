package jan31;

public class MethodEx {

	int var1 ,var2; //���������
	
	// public Methodex(){} ������.
	
	public int sum(int a,int b){ // ����޼���
		//���������� ����Ÿ�� �޼ҵ��(�Ű�����1,�Ű�����2)
		return a+b;
	}
	
	public static void main(String[] args){
		
		//sum(1000, -10)  // ���� static  ����(stack)�� �޼��� ����(heap)�� Ʋ����  ȣ�� �Ҹ�
		
		MethodEx me = new MethodEx();  // ��ü�� ����
		int res = me.sum(1000, -10); //�޼��� ȣ�� ==>������������
		System.out.println("res=" + res);
	}
	
	
	
}

/*
 *MethodEx
 *--------------------------------------------------
 *int var1,var2 
 * -----------------------------------------------
 * sum()
 * 
 */
