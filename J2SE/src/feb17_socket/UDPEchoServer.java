package feb17_socket;

import java.net.*;
import java.io.*;


public class UDPEchoServer {
	
	public UDPEchoServer(int port){
		
		try {
			DatagramSocket ds = new DatagramSocket(port);
			
			while(true){
				byte buffer[] = new byte[512];
				DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
				
				System.out.println("ready");
				 ds.receive(dp);
				 
				 String str = new String(dp.getData());
				 
				InetAddress ia = dp.getAddress();
				
				port = dp.getPort();
				
				System.out.println("client ip : "+ ia +" , client port : "+ port);
				
				dp = new DatagramPacket(dp.getData(),dp.getData().length,ia,port);
				
				ds.send(dp);
				
				
			}
		} catch (IOException ie) {
			// TODO Auto-generated catch block
			ie.printStackTrace();
		}
		 
		
		
		
	}

	public static void main(String[] args) throws Exception{
		new UDPEchoServer(3000);
	}
}
