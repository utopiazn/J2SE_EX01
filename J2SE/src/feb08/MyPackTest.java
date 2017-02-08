package feb08;

import MyPack.p1.MyPackTwo;

public class MyPackTest {
	
	public static void main(String[] args){
		MyPack.p1.MyPackOne myOne = new MyPack.p1.MyPackOne();
		myOne.one();
		MyPackTwo myTwo = new MyPackTwo();
		myTwo.two();
	}

}

/*결과
MyPackOne클래스의 one메서드
MyPackTwo클래스의 two메서드
*/