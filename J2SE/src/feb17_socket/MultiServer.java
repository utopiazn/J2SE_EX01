package feb17_socket;



import java.io.*;
import java.net.*;
import java.util.*;


public class MultiServer {
	
	private ArrayList<MultiServerThread> list; // Thread만 담을수 있는 리스트 선언/
	private Socket socket;
	
	public MultiServer() throws IOException{
		
		list = new ArrayList<MultiServerThread>();
		ServerSocket serverSocket = new ServerSocket(1234);
		
		MultiServerThread mst = null;
		
		boolean isStop = false;
		
		while(!isStop){
			System.out.println("Server ready....");
			socket = serverSocket.accept();
			mst = new MultiServerThread(this);
			
			
		}
	
		
	}
	
	
	public static void main(String[] args) throws IOException{
		
		new MultiServer();
	}

}
