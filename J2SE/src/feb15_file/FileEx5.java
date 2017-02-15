package feb15_file;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import com.sun.org.apache.bcel.internal.classfile.Attribute;

import static java.lang.System.out;

public class FileEx5 {

	public static void main(String[] args){
		
		if(args.length !=1 || args[0].length() != 1 || "tTlLnN".indexOf(args[0]) == -1){			
		
			
			
			System.out.println("USAGE : java FileEx5 SORT_OPTION   ");
			System.out.println("   SORT_OPTION :                   ");
			System.out.println("   t     Time asending sort.       "); 
			System.out.println("   T     Time descending sort.     ");
			System.out.println("   l     Length ascending sort.    ");
			System.out.println("   L     Length descending sort.  ");
			System.out.println("   n     Name asending sort.      "); //이름기준
			System.out.println("   N     Name descending sort.   ");
		
			System.exit(0);
		}
		
		
		final char option = args[0].charAt(0);
		
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		
		File[] files = dir.listFiles();
		
		Comparator comp = new Comparator(){		
			
			public boolean equals(Object o){ // not sued
				
				return false;
			}

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				
				long time1 = ((File)o1).lastModified();
				long time2 = ((File)o2).lastModified();

				long length1 = ((File)o1).length();
				long length2 = ((File)o2).length();
				
				String name1 = ((File)o1).getName().toLowerCase(); // 소문자로 변경
				String name2 = ((File)o2).getName().toLowerCase(); // 소문자로 변경
				
				int result = 0;
				
				switch(option) {
				case 't' :
					if(time1 - time2 > 0)  result =  1;
					else if(time1 - time2 == 0) result =  0;
					else if(time1 - time2 < 0)  result = -1;
					break;   
				case 'T' :
					if(time1 - time2 > 0)  result = -1;
					else if(time1 - time2 == 0) result =  0;
					else if(time1 - time2 < 0)  result =  1;
					break;
				case 'l' :
					if(length1 - length2 > 0)  result =  1;
					else if(length1 - length2 == 0) result =  0;
					else if(length1 - length2 < 0)  result = -1;
					break;   
				case 'L' :
					if(length1 - length2 > 0)  result = -1;
					else if(length1 - length2 == 0) result =  0;
					else if(length1 - length2 < 0)  result =  1;
					break;
				case 'n' :
					result = name1.compareTo(name2);
					break;
				case 'N' :
					result = name2.compareTo(name1);
					break;
				}
				return result;					
			}		
			
		};			
		
		Arrays.sort(files,comp);
		
		for(int  i =0; i<files.length;i++){
			
			File f = files[i];
			String name = f.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			String attribute ="";
			String size = "";
			
			if(files[i].isDirectory()){
				attribute = "DIR";
			}else{
				size = f.length() + "";
				attribute = f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : "";
						
			}
			
			
			
			out.printf("%s %s %6s %s\n",
					df.format(new Date(f.lastModified())),
					attribute,
					size,
					name
					);
			
			
		}
		
	}	
}



/* 결과

2017-02-15 11:04 DIR        src
2017-02-14 08:29 RW    330 output.xml
2017-02-14 08:29 RW    109 output.txt
2017-02-08 13:26 RW    860 error.log
2017-02-13 13:55 RW     37 data.txt
2017-02-15 11:04 DIR        bin
2017-02-01 11:37 DIR        .settings
2017-02-01 11:37 RW    380 .project
2017-02-01 11:37 RW      6 .gitignore
2017-02-01 11:37 RW    303 .classpath



*/