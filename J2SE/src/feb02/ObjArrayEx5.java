package feb02;
	
public class ObjArrayEx5 {
		
	public static void main(String[] args){
		int[][] test; // 다차원배열선언
		test = new int[2][3]; // 다차원 배열 생성
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		//------------------------  1행 초기화 끝
		test[1][0] = 500;
		test[1][1] = 600;
		test[1][2] = 700;
		//---------------------------- 2행 초기화 끝
		
		for(int i=0; i< test.length;i++){
			
			for(int j=0; j<test[i].length;j++){
				
				System.out.println("test["+i+"]["+j+"]" +test[i][j]);
			}
			
		}
	}
}
	

