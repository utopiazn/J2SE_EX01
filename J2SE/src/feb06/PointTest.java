package feb06;

public class PointTest {
	
	public static void main(String args[]){
		
		Point3D p3 = new Point3D(1, 2, 3);
		
		
	}

}


class Point2{
	int x;
	int y;
	
	Point2(int x, int y){
		
		this.x = x;
		this.y = y;
		
	}
	
	String getLpcation(){
		System.out.println("Point2");
		
		return "x :" +x+"y :"+y;
	}
	
}

class Point3D extends Point2{

	int z;
	
	Point3D(int x, int y,int z) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
		this.z = z;
	}
	
	String getLocation2(){ //오버라이딩
		System.out.println("Point3D");
		return "X :" +x + ",y :" +y +", z :" +z;
	}
	
}