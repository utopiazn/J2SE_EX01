package jan25;

public class ParameterCheck {

	private boolean bCheck;
	private int iLength;
	private String[] args;
	
	 public ParameterCheck(String[] args) {
		// TODO Auto-generated constructor stub		 
		 this.args = args;
		 this.iLength = args.length;		 
		 
		 System.out.println("전달 인자 수: "+ iLength);
		
		if(args.length == 0){
			
			System.out.println("전달된 인자 없음");				
			this.bCheck = false;
			
		}else{
			this.bCheck = true;
		}		
	}
	 
	 public boolean getParameterCheck(){
		 
		return this.bCheck;
		 
	 }
	 
	 

	 public int getParameterLength(){
		 
		return this.iLength;
		 
	 }

	 public boolean getCmpStr(int idx,String str){
		 
		if(idx >=0 && idx < iLength  ){
			
			if( this.args[idx].equals(str) ){
				
				return true;
				
			}else{
				return false;
			}
				
		}else{			
			return false;
		}
		
	 }
	 
}
