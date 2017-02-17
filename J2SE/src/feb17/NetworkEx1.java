package feb17;

import java.net.*;
import java.util.*;
import static java.lang.System.out;

public class NetworkEx1 {
	
	public static void main(String[] args){
		
		InetAddress ip 		= null;
		InetAddress[] ipArr	= null;
		
		try{
			
			ip = InetAddress.getByName("www.daum.net");
			
			out.println("getHostName() :"+ip.getHostName());  //getHostName() :www.daum.net
			out.println("getHostAddress() :"+ip.getHostAddress());	//getHostAddress() :27.0.236.36		
			out.println("toString() :"+ip.toString()); //toString() :www.daum.net/27.0.236.36
			


			
			
			
			byte[] ipAddr = ip.getAddress();
			out.println("getAddress() :"+Arrays.toString(ipAddr) ); //	getAddress() :[27, 0, -20, 36]
			
			
			String result = "";
			for(int i =0; i<ipAddr.length;i++){
				result += (ipAddr[i]<0) ? ipAddr[i] +256 : ipAddr[i]; 				result += ".";
			}
			
			out.println("getaddress()+ 256 :"+result);//	getaddress()+ 256 :27.0.236.3

			out.println();
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
		
		
		try{
			
			ip = InetAddress.getLocalHost();
			out.println("getHostName() :"+ip.getHostName());//getHostName() :KH_I
			out.println("getHostAddress() :" + ip.getHostAddress());//getHostAddress() :192.168.30.28
			out.println();
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
		
		
		
		try{
			ipArr = InetAddress.getAllByName("www.daum.net");

			//ipArr[0] :www.daum.net/27.0.237.55
			//ipArr[1] :www.daum.net/27.0.236.36

			
			for(int i=0; i < ipArr.length; i++) {
				System.out.println("ipArr["+i+"] :" + ipArr[i]);
			}			
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
		
	}

}

/*결과/

getHostName() :www.daum.net
getHostAddress() :203.217.239.31
toString() :www.daum.net/203.217.239.31
getAddress() :[-53, -39, -17, 31]
getaddress()+ 256 :203.217.239.31.

getHostName() :KH_I
getHostAddress() :192.168.30.28

ipArr[0] :www.daum.net/203.217.239.31
ipArr[1] :www.daum.net/27.0.236.36



 */




