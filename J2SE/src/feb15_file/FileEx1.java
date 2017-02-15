package feb15_file;

import java.io.*;
import static java.lang.System.out;
public class FileEx1 {
	
	public static void main(String[] args) throws IOException{
		
		
		File f = new File("C:\\io\\FileEx1.java");
		String fileName = f.getName();
		
		int pos = fileName.lastIndexOf("."); //7
		
		out.println("경로를 제외한 파일이름 - " + f.getName());
		out.println("확장자를 제외한 파일이름 - " + fileName.substring(0,pos));
		out.println("확장자 - " + fileName.substring(pos+1));

		out.println("경로를 포함한 파일이름 - " + f.getPath());
		out.println("파일의 절대경로        - " + f.getAbsolutePath());
		out.println("파일이 속해 있는 디렉토리 - " + f.getParent());
		out.println();
		out.println("File.pathSeparator - " + File.pathSeparator); // ; 구분자
		out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);  // \\구분자
		out.println("File.separator - " + File.separator);
		out.println("File.separatorChar - " + File.separatorChar);
		out.println();
		out.println("user.dir="+System.getProperty("user.dir"));
		out.println("sun.boot.class.path=" + System.getProperty("sun.boot.class.path"));
		
	}

	
}
/*결과
경로를 제외한 파일이름 - FileEx1.java
확장자를 제외한 파일이름 - FileEx1
확장자 - java
경로를 포함한 파일이름 - C:\io\FileEx1.java
파일의 절대경로        - C:\io\FileEx1.java
파일이 속해 있는 디렉토리 - C:\io

File.pathSeparator - ;
File.pathSeparatorChar - ;
File.separator - \
File.separatorChar - \

user.dir=C:\Java\JavaGit\J2SE_EX01\J2SE
sun.boot.class.path=C:\Program Files\Java\jre1.8.0_121\lib\resources.jar;C:\Program Files\Java\jre1.8.0_121\lib\rt.jar;C:\Program Files\Java\jre1.8.0_121\lib\sunrsasign.jar;C:\Program Files\Java\jre1.8.0_121\lib\jsse.jar;C:\Program Files\Java\jre1.8.0_121\lib\jce.jar;C:\Program Files\Java\jre1.8.0_121\lib\charsets.jar;C:\Program Files\Java\jre1.8.0_121\lib\jfr.jar;C:\Program Files\Java\jre1.8.0_121\classes


*/