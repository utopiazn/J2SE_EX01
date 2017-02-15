package feb15_file;
import java.io.*;
import static java.lang.System.out;


public class FileEx {
	
	public static void main(String[] args) throws IOException{
		
		String filePath = "C:\\Java\\장기과정";  // 한글 오류
		
		File f1 = new File(filePath);
		
		String list[] = f1.list();
		
		for(int i=0;i<f1.length();i++){
			
			File f2 = new File(filePath,list[i]);
			
			if(f2.isDirectory()){
				
				out.printf("%s : 디렉토리 %n",list[i]);
				
			}else{
				out.printf("%s : 파일 (%,dbyte)%n",
						list[i],
						f2.length());
			}
			
			
		}
		
		out.printf("-----------------");
		
		
		File f3 = new File("C:\\io\\test.txt");
		out.println(f3.createNewFile());//true
		out.println(f3.getAbsolutePath());//C:\\io\\test.txt
		out.println(f3.getCanonicalPath());//C:\\io\\test.txt
		out.println(f3.getPath());//C:\\io\\test.txt
		out.println(f3.getName());//test.txt
		out.println(f3.getParent());//C:\\io
		File f4 = new File("C:\\io\\test.txt");
		File f5 = new File("C:\\io\\test11111.txt");
		out.println(f4.renameTo(f5));	
		
	
		
	}

}
