package feb17;

import java.net.*;
import static java.lang.System.out;
public class InetAddressEx {
	
	
	static void printf(InetAddress iaddr){
		
		out.printf("호스트 이름 : %s \n", iaddr.getHostName());		 
		out.printf("호스트 IP 주소 : %s \n",iaddr.getHostAddress()); 	
		
	}
	
	public static void main(String[] args) throws UnknownHostException{
		
		
		InetAddress iaddr = InetAddress.getLocalHost();
		
		printf(iaddr);	 //호스트 이름 : KH_I 
						//호스트 IP 주소 : 192.168.30.28 
	
		
		out.println();
		
		iaddr = InetAddress.getByName("www.oracle.com");
			
		printf(iaddr);	 //호스트 이름 : www.oracle.com 
		                 //호스트 IP 주소 : 202.43.57.234 
		
		
		InetAddress sw[] = InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress temp_sw : sw){
		
			out.println();
			
			printf(iaddr);
		}
		
		
		
		
		
		
	}

}

/* 결과
호스트 이름 : KH_I 
호스트 IP 주소 : 192.168.30.28 

호스트 이름 : www.oracle.com 
호스트 IP 주소 : 202.43.57.234 

호스트 이름 : www.oracle.com 
호스트 IP 주소 : 202.43.57.234 

호스트 이름 : www.oracle.com 
호스트 IP 주소 : 202.43.57.234 


*/