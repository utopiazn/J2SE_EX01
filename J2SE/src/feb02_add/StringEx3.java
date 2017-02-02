package feb02_add;

public class StringEx3 {
	
	public static void main(String[] args){
		
		String s1 = "AAA";
		String s2 = new String("AAA");

		if(s1==s2){
			System.out.println("s1==s2 ? true");			
		}else{
			System.out.println("s1==s2 ? false");
		}
		
	
	
		//String 클래스의 String 인스턴스의 문자열을 constant pool에 등록한다.
		//constant pool'에 이미 존재할 경우에는 해당 문자열의 주소를 변환 한다.
		s2 = s2.intern();// s2에는 s1과 같은 주소값이 저장되게 된다.(기존의 s2의 인스턴스는 가비지 컬렉트된다.
						
		System.out.println("s2에 intern()을 호출한 후");
		
		if(s1== s2){
			System.out.println("s1==s2 ? true");
		}else{
			System.out.println("s1==s2 ? false");
		}
		
	}
}


/*
Java에서 쓰이는 모든 String 객체는 상수풀에서 관리되고,
상수풀은 클래스와 같은 Heap의 Permanent area(고정 영역)에 생성되어 Java 프로세스의 종료까지 그 LifeTime을 갖습니다.
즉, String을 new로 생성하지 않고 "" 리터럴을 사용하여 생성할 경우,
 내부적으로 new String() 메소드 호출 이후에 String.intern()이라는 메소드가 호출되어 고유의 인스턴스를 공유하도록 interned됩니다.
  이것은 생성한 String을 Constant pool에 등록하는(만약 이전에 같은 char sequence의 문자열이 이미 상수풀에 있다면 문자열을 힙에서 해제하고 그 상수풀의 레퍼런스를 반환) 작업을 수행합니다.
일반적으로 문자열들을 비교하기 위해서 equals메서드를 사용하지만, 
equals메서드로 문자열의 내용을 비교하는 것보다는 등가비교연산자(==)를 이용해서 주소(4 byte)를 비교하는 것이 더 빠릅니다.
그러나, intern() 과정에서 전체 문자열을 equals() 함으로 문자열 억제로 확실히 효과가 크다고 판단되는 상황이 아니면 권장하지 않습니다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
