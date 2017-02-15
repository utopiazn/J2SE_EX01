package feb15_file;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.io.*;
import javax.swing.filechooser.*;
public class JTreeDelegate extends JTree{
	private JTreeModel jtm;
	private DefaultTreeModel m_model;	
	private Icon driver_img,folder_img,foleropen_img;
	public JTreeDelegate(){
		super(new JTreeModel());
		File f = new File("c:"+System.getProperty("file.separator"));
		FileSystemView fsv = FileSystemView.getFileSystemView() ;
		driver_img = fsv.getSystemIcon(f);
		folder_img = new ImageIcon("image/folder_close.gif");
		foleropen_img = new ImageIcon("image/folder_open.gif");
		setCellRenderer(new MyRenderer());
		addTreeSelectionListener(new MySelectionListener());
	}
	private class MySelectionListener implements 
		TreeSelectionListener{
		public void valueChanged(TreeSelectionEvent e){
			TreePath path = e.getPath();
			Object[] nodes = path.getPath();
			String filepath = "";
			for(int k=0;k<nodes.length;k++){
				DefaultMutableTreeNode node = 
					(DefaultMutableTreeNode)nodes[k];
                System.out.println(nodes[k]);
				if(node.getUserObject()instanceof Directory) {
					filepath +=  node.toString()+
                        System.getProperty("file.separator");
				}else if(node.getUserObject()instanceof Driver) {
					filepath += 
						node.toString();
				}
			}	
			DefaultMutableTreeNode node = 
				(DefaultMutableTreeNode)nodes[nodes.length-1];
			File f1 = new File(filepath);	
			File f2=null;
			String list[] = f1.list();	
			if(list != null){
				for(int i=0;i<list.length;i++){				
					f2 = new File(filepath+list[i]);	
					if(f2.isDirectory()){		
						DefaultMutableTreeNode dmt1 = 
						new DefaultMutableTreeNode(
						new Directory(list[i]));
						node.add(dmt1);								
					}							
				}						
			}
		}
	}
	private class MyRenderer extends DefaultTreeCellRenderer {
        public Component getTreeCellRendererComponent(JTree tree,
			Object value,boolean sel,boolean expanded,
			boolean leaf, int row, boolean hasFocus) {
            super.getTreeCellRendererComponent(tree, value, sel,
				expanded, leaf, row,hasFocus);
			if (getObejct(value) instanceof Driver) {
				setIcon(driver_img);
            }else if(getObejct(value) instanceof Directory){
				if(expanded)
					setIcon(foleropen_img);
				else
					setIcon(folder_img);
			}
            return this;
        }
		private Object getObejct(Object value) {
            DefaultMutableTreeNode node = 
				(DefaultMutableTreeNode)value;
			return   node.getUserObject();
        }
	}
}