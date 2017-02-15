package feb15_file;
import java.io.*;
import java.util.*;


public class FileEx7 {
	
	public static void main(String[] args) throws Exception
	{
		
		
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx7 pattern");
			System.exit(0);
		}
		
		
		String currDir = System.getProperty("user.dir");
		
		File dir = new File(currDir);
		
		
		
		final String pattern = args[0];
	
		
		// String[] list(Filenmaefilter filter)
		String[] files = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				//return false;
				return name.indexOf(pattern)!= -1;
			}
		});
		
		
		
		for(int i=0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		
		
	}
	

}