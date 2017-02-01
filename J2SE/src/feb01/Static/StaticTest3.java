package feb01.Static;

public class StaticTest3 {
	
	public static void main(String[] args){
		
		StaticCount sc1 = new StaticCount();
		System.out.println("sc1의 c : " + sc1.c + ", sc1.count : "+sc1.count+ ", StaticCount.count :" + StaticCount.count);
		
		StaticCount sc2 = new StaticCount();
		System.out.println("sc2의 c : " + sc1.c + ",  sc2.count : "+sc2.count+", StaticCount.count " + StaticCount.count);

		StaticCount sc3 = new StaticCount();
		System.out.println("sc1의 c : " + sc1.c + ",  sc3.count : "+sc3.count+", StaticCount.count " + StaticCount.count);


	}

}



/*   참조   
class StaticCount {
	int c; //instance 변수 0
	static int count;// static변수 0
	
	public  StaticCount(){
		c++;
		count++;
	}

}
*/






