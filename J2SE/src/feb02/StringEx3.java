package feb02;

public class StringEx3 {
	
	public static void main(String[] args){
		int count =0;
		
		
		// 앞에서 부터 순서대로 서로 다른 영역들이 합처짐
		// s += ++count 
		// s += " little,"
		// s += ++count 
		// s += " little, "
		// s += ++count
		// s += " little Indian"
		
		String mag = ++count + " little," + "\n" +
				++count + " little, " + "\n" +
				++count + " little Indian";
		
		System.out.println(mag);
		
	}

}
