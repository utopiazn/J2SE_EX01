package feb17_socket;

import java.net.*;
import java.io.*;
import static java.lang.System.out;

public class UDPEchoClient {
	
	private String str;
	private BufferedReader file;
	private static int SERVERPORT = 3000;
	
	public UDPEchoClient(String ip,int port){
		
		try{
			InetAddress ia = InetAddress.getByName(ip);
			DatagramSocket ds = new DatagramSocket(port);
			
			System.out.println("message : ");
			
			file = new BufferedReader( new InputStreamReader(System.in));
			
			str = file.readLine();
			byte buffer[] = str.getBytes();
			
			DatagramPacket dp = new DatagramPacket(buffer,buffer.length,ia,SERVERPORT);
			ds.send(dp);
			
			buffer = new byte[512];
			dp = new DatagramPacket(buffer, buffer.length);
			ds.receive(dp);
			
			out.println("Server ip : " + dp.getAddress()+ " , server port : "+dp.getPort());
			out.println("수신된 데이터  :" + new String(dp.getData()).trim());
			
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] srgs){
		
		new UDPEchoClient("localhost", 2000);
	}

}
