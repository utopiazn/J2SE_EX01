package feb17_socket;

public class MultiClientThread extends Thread {

	private MultiClient mc;
	public MultiClientThread(MultiClient mc) {
		// TODO Auto-generated constructor stub
		this.mc = mc;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		String message = null;
		String[] receivedMsg = null;
		boolean isStop = false;
		
		while(!isStop){
			try{
				
			}catch(Exception e){
				e.printStackTrace();
				isStop = true;
			}
			
			
		}
		System.out.println(receivedMsg[0]+","+ receivedMsg[1]);
		
		if(receivedMsg[1].equals("exit")){
			
			if(receivedMsg[0].equals(mc.getId())){
				mc.exit();
			}else{
				mc.getJta().append(receivedMsg[0]+ "님이 종료 하셨습니다."+
							System.getProperty("line.separator"));
				
				mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
				
				
												
			}
			
		}else{
			
			  mc.getJta().append(receivedMsg[0] +" : "+receivedMsg[1]+
		                System.getProperty("line.separator"));
			  
		      mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
		}
		
		
	}
	
	

}
