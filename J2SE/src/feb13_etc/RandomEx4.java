package feb13_etc;

import java.util.*;


public class RandomEx4 {
	
	final static int RECORD_NUM = 10; // 생성할 레코드의 수를 정한다.
	final static String TABLE_NAME = "TEST_TABLE";
	final static String[] CODE1 = {"010","011","017","018","019"};
	final static String[] CODE2 = {"남자","여자"};
	final static String[] CODE3 = {"10대","20대","30대","40대","50대"};
	
	
	
	public static void main(String[] args){
	
		for(int i=0; i<RECORD_NUM; i++){
			System.out.println("INSETR INTO " + TABLE_NAME
					+ "VALUES("
					+ " '"+ getRandArr(CODE1) + "'"
					+ ", '"+ getRandArr(CODE2) + "'"
					+ ", '"+ getRandArr(CODE3) + "'"
					+ ","  + getRand(100,200)  // 100~200 사이의 값을 얻는다.
					+ ");");  
		}
		
	}
	
	public static String getRandArr(String[] arr){		
		return arr[getRand(arr.length-1)]; // 배열에 저장된 값 중 하나를 반환한다.
	}
	
	public static int getRand(int n){
		
		return getRand(0,n);
	}
	
	
	public static int getRand(int from, int to){
		
		return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from, to);
	}

}

/*
INSETR INTO TEST_TABLEVALUES( '011', '여자', '10대',143);
INSETR INTO TEST_TABLEVALUES( '017', '여자', '50대',182);
INSETR INTO TEST_TABLEVALUES( '017', '여자', '30대',145);
INSETR INTO TEST_TABLEVALUES( '017', '남자', '40대',135);
INSETR INTO TEST_TABLEVALUES( '017', '남자', '20대',111);
INSETR INTO TEST_TABLEVALUES( '010', '여자', '10대',110);
INSETR INTO TEST_TABLEVALUES( '011', '여자', '40대',105);
INSETR INTO TEST_TABLEVALUES( '018', '남자', '20대',155);
INSETR INTO TEST_TABLEVALUES( '011', '남자', '30대',106);
INSETR INTO TEST_TABLEVALUES( '018', '남자', '50대',113);
 */
