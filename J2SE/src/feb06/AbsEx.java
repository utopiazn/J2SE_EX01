package feb06;

class AbsEx extends AbsEx2 {

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		
		return str;
	}

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	
	
	public static void main(String[] args){
		
		AbsEx ae = new AbsEx();
		System.out.println("ae.getA()   :"+ae.getA());
		System.out.println("ae.getStr() :"+ae.getStr());
		
	}
	


}

/*  결과

ae.getA()   :100
ae.getStr() :abstract test



*/