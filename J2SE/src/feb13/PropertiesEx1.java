package feb13;


import java.util.Properties;
import java.util.Enumeration; //Iterator
import static java.lang.System.out;



public class PropertiesEx1 {
	
	public static void main(String[] args){
		
		Properties prop = new Properties();
		
		prop.put("UserName", "Michael"); // 속성 저장하기
		prop.setProperty("lovely","SunAe");
		prop.setProperty("dbDRV","oracle.jdbc.driver.OracleDriver");
		
		
		String user = prop.getProperty("UserName"); // 속성가져오기
		String love = prop.getProperty("lovely"); // 속성가져오기
		String db_drv = prop.getProperty("dbDRV");
		
		out.println(user);//Michael		
		out.println(love);//SunAe
		out.println(db_drv);//oracle.jdbc.driver.OracleDriver
		

		out.println("----------keys----------------------");
		Enumeration keys = prop.propertyNames(); //키값들만 얻어내기
		
		
		//dbDRV,lovely,UserName
		while(keys.hasMoreElements()){
			out.println(keys.nextElement());
		}
		
		prop.list(System.out);		
		//dbDRV=oracle.jdbc.driver.OracleDriver
		//lovely=SunAe
		//UserName=Michael
	}

}
