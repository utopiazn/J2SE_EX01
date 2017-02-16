package feb16;
import java.io.*;

public class ObjectInOutputStreamEx {
	
	
	public static void main(String[] args){
		
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fos = new FileOutputStream("C:\\io\\object.ser");
			oos = new ObjectOutputStream(fos);			
			oos.writeObject(new Customer("SSOL"));
			

			fis = new FileInputStream("C:\\io\\object.ser");
			ois = new ObjectInputStream(fis);
			Customer m = (Customer)ois.readObject();
			System.out.println(m);
			
			
			
			
		}catch(IOException ioe){
			ioe.printStackTrace();
			
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}finally{
			
			try{
				
				if(fis != null) fos.close();
				if(ois != null) ois.close();
				if(fos != null) fos.close();
				if(oos != null) oos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
				  
			
		}
		
		
	}

}
