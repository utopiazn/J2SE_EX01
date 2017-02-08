package feb08_add;

import java.io.*;

public class ExceptionEx21 {
	
	public static void main(String[] args){
		
		//command line  에서 입력받는 값을 이름으로 갖는 파일을 생성한다.
		File f = createFile(args[0]);
		System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다.");
		
		
	}
	
	static File createFile(String fileName){
		
		try{
			if(fileName == null || fileName.equals("")){
				throw new Exception("파일이름이 유효하지 않습니다.");
			}
		}catch(Exception e){
			// fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로한다.

			fileName = "제목없음" + ".txt";
		}finally{
			
			File f = new File(fileName); // File클래스의 객체를 만든다.
			CreateNewFile(f);            // 생성된 객체를 이용해서 파일을 생성한다.
			return f;
		}
		
	}
	
	static void CreateNewFile(File f){
		
		try{
			f.createNewFile(); // 파일을 생성한다.
		}catch(Exception e){
			
		}
		
	}

}
