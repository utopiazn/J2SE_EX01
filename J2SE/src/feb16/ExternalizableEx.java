package feb16;

import java.io.*;

public class ExternalizableEx implements Externalizable {

	private String name;
	private int age;
	private int weight;
	
	public ExternalizableEx(){}
	
	public  ExternalizableEx(String name, int age, int weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;

	}
	
	@Override
	public void readExternal(ObjectInput objInput) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = (String)objInput.readObject();
		age = ((Integer)objInput.readObject()).intValue();
	}

	@Override
	public void writeExternal(ObjectOutput objInput) throws IOException {
		// TODO Auto-generated method stub
		objInput.writeObject(name);
		objInput.writeObject(new Integer(age));	
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		
		return "name : " + name + 
				" , age : "+ age +
				" , weight : " + weight;
	}

	public static void main(String[] args){
		
		ExternalizableEx ex1 = new ExternalizableEx("SSOL",30,70);
		FileOutputStream fos = null;
		ObjectOutputStream oos =null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			fos = new FileOutputStream("C:\\io\\external.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ex1);
			
			fis = new FileInputStream("C:\\io\\external.ser");
			ois = new ObjectInputStream(fis);
			
			ExternalizableEx ex2 = (ExternalizableEx) ois.readObject();
			
			System.out.println("원본 객체 :" +ex1);
			System.out.println("복원된 객체" +ex2 );
		
		}catch(IOException ie){
			ie.printStackTrace();
			
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}finally{
			
			try{
				if (fis != null) fis.close();
				if (ois != null) ois.close();
				if (fos != null) fos.close();
				if (oos != null) oos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			
		}
		
		
	}
	
	
}
