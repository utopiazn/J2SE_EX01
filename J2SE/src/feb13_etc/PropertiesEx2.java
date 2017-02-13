package feb13_etc;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class PropertiesEx2 {
	
	public static void main(String[] args){
		
		//commandline 에서 inputfile을 저장해주 않으면 프로그램을 종료한다.		
		if(args.length !=1){
			
			out.println("USAGE: java PropertiesEx2 INPUTFILENAME");
			System.exit(0);
		}
		
		Properties prop = new Properties();
		String inputFile = args[0];
		
		try{
			prop.load(new FileInputStream(inputFile));
			
		}catch(IOException e){
			out.println("지정된 파일 찾을수 없습니다.");
			System.exit(0);
		}
		
		String name = prop.getProperty("name");
		String[] data = prop.getProperty("data").split(",");
		
		int max =0;
		int min =0;
		int sum =0;
		
		for(int i=0; i< data.length; i++){
			int intValue = Integer.parseInt(data[i]);
			
			if(i==0){
				max = min= intValue;				
			}else if(min>intValue){
				min = intValue;
			}
			sum += intValue;			
			
		}
		
		out.println("이름 :"+ name);
		out.println("최대값:"+ max);
		out.println("최소값:"+ min);
		out.println("합계  :"+ sum);
		out.println("평균  :"+ (sum*100.0/data.length)/100);
		
	}

}
