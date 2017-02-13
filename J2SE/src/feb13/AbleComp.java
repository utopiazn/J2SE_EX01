package feb13;
import java.util.Comparator;

class AbleComp implements Comparator<Able>{

	@Override
	public int compare(Able obj1, Able obj2) {
		// TODO Auto-generated method stub
		int var =0;
		
		if(obj1.getTotal() >obj2.getTotal()){
			var = 1;
			
		}else if(obj1.getTotal() <obj2.getTotal()){
			var = -1;
		}else{
			var = 0;
		}
		
		return var;
	}

	
	
	
	
}
