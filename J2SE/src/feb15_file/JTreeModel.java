package feb15_file;

import javax.swing.tree.*;
import java.io.*;
public class JTreeModel extends DefaultMutableTreeNode{
	private String filePath = "c:"+System.getProperty("file.separator");;
	private File f1,f2;
	private String[] list;
	public JTreeModel(){
		super(new Driver("c:"+System.getProperty("file.separator")));
		DefaultMutableTreeNode dmt1=null;		
		f1 = new File(filePath);			
		list = f1.list();			
		for(String _temp : list){				
			f2 = new File(filePath,_temp);			
			if(f2.isDirectory()){	
				dmt1 = new DefaultMutableTreeNode(
					new Directory(_temp));
				add(dmt1);				
			}			
		}
	}
}
