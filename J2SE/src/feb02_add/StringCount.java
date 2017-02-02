package feb02_add;

public class StringCount {

	private int count;
	private String source = "";
	
	public StringCount(String sourec){
		
		this.source = sourec;
		
	}
	
	
	
	public int stringCount(String s){
		
		return stringCount(s,0);
	}
	
	public int stringCount(String s, int pos){
				
		
		int index = 0;
		
		if(s == null || s.length() ==0 ){			
			return 0;
		}
		
		if( (index = source.indexOf(s,pos)) != -1){
			this.count++;
			stringCount(s,index +s.length());
		}
			
		
		return this.count;
	}
	
	
	public static void main(String[] args){
		
		String str = "aabbccAABBCCaa";
		System.out.println(str);
		
		StringCount sc = new StringCount(str);
		System.out.println("aa를"+ sc.stringCount("aa",0)+ "개 찾았습니다.");
		
		
		
		
	}

}

/*
aabbccAABBCCaa
aa를2개 찾았습니다.
 */
