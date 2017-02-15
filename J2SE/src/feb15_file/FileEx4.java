package feb15_file;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.System.out;

public class FileEx4 {
	
	public static void main(String[] args){
		
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		
		File[] files = dir.listFiles();
		
		for(int i =0; i<files.length; i++){
			File  f = files[i];
			String name = f.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mma");
			String attribute ="";
			String size = "";
			
			if(files[i].isDirectory()){
				attribute = "DIR";
			}else{
				size = f.canRead()+"";
				attribute  = f.canRead()  ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";
			}
			
			out.printf("%s %3s %6s %s\n", 
					df.format(new Date(f.lastModified())),
					attribute,
					size,
					name);
			
		}			
	}
}
/*결과
2017-02-01 11:37오전 RW    true .classpath
2017-02-01 11:37오전 RW    true .gitignore
2017-02-01 11:37오전 RW    true .project
2017-02-01 11:37오전 DIR        .settings
2017-02-15 11:04오전 DIR        bin
2017-02-13 13:55오후 RW    true data.txt
2017-02-08 13:26오후 RW    true error.log
2017-02-14 08:29오전 RW    true output.txt
2017-02-14 08:29오전 RW    true output.xml
2017-02-15 11:04오전 DIR        src

*/