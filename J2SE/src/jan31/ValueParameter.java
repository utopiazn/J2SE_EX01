package jan31;

// call by value : var1�̶�� ���� ���� ������ ������ ����.


public class ValueParameter {
	
	public int increase(int n){ // n = var1
		++n;
		return n;
		
	}
	
	public static void main(String[] args){
		int var1 = 100; // ��������
		
		ValueParameter vp = new ValueParameter(); // ��ü ����
		int var2 = vp.increase(var1); // 101
		System.out.println("var1 : "+ var1 + ", var2 : " + var2);
		
	}

}



//ValueParameter
//===============
//increase()
//