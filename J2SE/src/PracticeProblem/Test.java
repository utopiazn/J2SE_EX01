package PracticeProblem;


class Super {
    int index = 5;
    public void printVal() {
         System.out.println("Super");
    }
}

  class Sub extends Super {
    int index = 2;
    public void printVal() {
          System.out.println("Sub");
    }
}


class Test12 {
    int x;
    public Test12(int x) {
	this.x = x; 
}
}

public class Test {
	
	 private static int a=2;
	
	/*
	String s;
	  static int a = 1;
	  public static int add(int arr[]) {
          int x = -1;
          for ( int i = 0; i < arr.length; i ++)
                x= x < arr[i] ? arr[i] : x;
          return x;
      }  
	  
	   static int d;
	  */
	
	public static  void method(Test12 v1, Test12 v2) {
              v2.x = 20;
              System.out.println("log1:" +v1.x + ", " + v2.x);
              v1=v2;
              System.out.println("log2:" +v1.x + ", " + v2.x);
    }	   
	public static void modify(int b) {
		
		a +=b;
    }   
	
	public static void main(String[] args){
		
		
		  Super sup=new Sub();
          System.out.println(sup.index + " ");
          sup.printVal();
		
		/*
		 modify(a);
         System.out.println(a);
		
		
		Test12 x1 = new Test12(30);
		Test12 x2 = new Test12(10);
		method(x1, x2);
	
		
		 System.out.println("log3:" +x1.x + ", " + x2.x);
		
	*/
	//	 Test t = new Test();
      //   t.go();
		/*
		double d = 10.55555;
		float f = (float)d;
		
		System.out.println(f);
		
		int i =10;
		
		int n = i++%5;   
		System.out.println(n);
		
		
		System.out.println(a);
		*/
		//int[] x={0, '0', 'A', 'a'};
        //System.out.println(add(x));
		
	}
	/*
	 void Test() {
         s = "constructor";
    }
    void go() {
         System.out.println(s);
    }
    */

}
