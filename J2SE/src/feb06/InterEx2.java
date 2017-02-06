package feb06;

interface Inter1{
	public int getA();
}

interface Inter2{
	public int getA();
}

interface Inter3 extends Inter1,Inter2{
	public int getData();
}


class InterEx2 implements Inter3 {

	int a =100;
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a+10;
	}


	public static void main(String[] args){
		
		InterEx2 it = new InterEx2(); 
		
		// 동일한 주소값을 같는다.
		Inter1 it1 = it;
		Inter2 it2 = it;
		Inter3 it3 = it;
		
		
		System.out.println(it.getA());
		System.out.println(it.getData());
		
		
		// 같은 주소값 확인
		System.out.println(it);
		System.out.println(it1);
		System.out.println(it2);
		System.out.println(it3);
		
	}

}
