package jan31;

public class MethodEx2 {
	
	
	private int var; // �������(��������): �⺻��:0
	
	public void setInt(int var){
		this.var = var; //�޼ҵ��� ���޵Ǵ� �Ű������� Ŭ������ ���������� �ʱ�ȭ �Ѵ�.....
	}
	
	public int getInt(){
		return var;
	}
	
	
	public static void main(String[] args){
		
		MethodEx2 me2 = new MethodEx2(); // ��ü ����.
		me2.setInt(1000); // ���������� �ʱ�ȭ �Ѵ�.
		System.out.println("var : "+ me2.getInt());
		
		
	}
	
	

}

/*
 * MethodEx2
 * ===========
 * int var
 * ===========
 * SetInt()
 * GetInt()
 * 
 * 
 * 
 */
