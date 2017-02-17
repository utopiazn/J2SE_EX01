package feb17_socket;

import java.io.*;
import java.net.*;
import static java.lang.System.out;

public class EchoServer {
	
	private BufferedReader bufferR;
	private BufferedWriter bufferW;
	private InputStream is;
	private OutputStream os;
	private ServerSocket serverS;
	
	
	
	public EchoServer(int port ){
		
		try{
			serverS = new ServerSocket(port);
			
		}catch(IOException ie){
			ie.printStackTrace();
			System.exit(0);
		}
		
		while(true){
			try{
				out.println("클라이언트를 요청을 기다리는 중.");
				
				Socket tcpSocket = serverS.accept();
				
				System.out.println("클라이언트의 IP 주소 : "+tcpSocket.getInetAddress().getHostAddress());
				
				is = tcpSocket.getInputStream();
				os = tcpSocket.getOutputStream();
				
				bufferR = new BufferedReader(new InputStreamReader(is));
				bufferW = new BufferedWriter(new OutputStreamWriter(os));
				
				String message = bufferR.readLine();
				
				out.println("수신메시지 : "+ message);
				
				message = message + System.getProperty("lin.separator");
				bufferW.write(message);
				bufferW.flush();
				
				bufferR.close();
				bufferW.close();
				tcpSocket.close();
				
			}catch(IOException ie){
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args){
		new EchoServer(3000);
	}
}
