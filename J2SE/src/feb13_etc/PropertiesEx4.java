package feb13_etc;

import java.util.*;
import static java.lang.System.out;

public class PropertiesEx4 {
	
	public static void main(String[] args){
		
		Properties sysProp = System.getProperties();
		
		out.println("java.version :"+ sysProp.getProperty("java.version"));
		out.println("user.languag :"+ sysProp.getProperty("user.language"));
		sysProp.list(out);
	}

}
