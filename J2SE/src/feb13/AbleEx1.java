package feb13;

import java.util.Arrays;
import java.util.Vector;
import static java.lang.System.out;

public class AbleEx1 {
	
	static void print(Vector<Able> v){
		
		Able[] a = new Able[v.size()];
		v.copyInto(a);
		print(a);
	
	}	
	
	static void print(Able[] v){
		
		for(Able n : v){
			out.println(n.empno+","+n.getTotal());
		}
	}
	
	
	
	
	public static void main(String[] args){
		
		Vector<Able> v = new Vector<Able>(2,5);
		
		//Able 객체 생성 및 Vector에 추가;
		Able a1 = new Able("B123",90,75,70);
		Able a2 = new Able("T723",60,90,80);
		Able a3 = new Able("A427",85,80,80);
		Able a4 = new Able("G533",90,90,60);
		
		v.addElement(a1);
		v.addElement(a2);
		v.addElement(a3);
		v.addElement(a4);
		
		out.println("-----Sort 전--------------------");
		
		print(v);
		//B123,235
		//T723,230
		//A427,245
		//G533,240
		
		Able[] a = new Able[v.size()];
		
		v.copyInto(a);// Able을 배열에 옮겨 답는다.
		
		AbleComp comp = new AbleComp();
		Arrays.sort(a,comp);
		
		out.println("-----Sort 후--------------------");
		
		print(a);
		//T723,230
		//B123,235
		//G533,240
		//A427,245

		
	}

}
