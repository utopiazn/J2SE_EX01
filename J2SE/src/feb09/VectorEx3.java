package feb09;

import java.util.Vector;
import static java.lang.System.out;

public class VectorEx3 {
	
	public static void main(String[] args){
		
		Vector<Double> v = new Vector<Double>(2,5);
		
		//자원추가		
		v.add(100.3);
		v.add(3.14);
		v.addElement(1000.);
		
		int size = v.size();
		
		Double[] data = new Double[size];
		
		v.copyInto(data); //백터에 배열을 복사함.
		
		for(double n: data){			
			out.println(n);			
		}		
				
		
		
	}

}


/*
//결과

100.3
3.14
1000.0
*/