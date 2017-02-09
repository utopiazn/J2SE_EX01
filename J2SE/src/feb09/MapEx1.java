package feb09;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Set;

public class MapEx1 {
	
	public static void main(String[] args){
		
		String[] msg = {"Berlin","Dortmund","Frankfurt",
			"Gelsenkirchen","Hamburg"};
		
		// <key, value>
		HashMap<Integer,String> map =
				new HashMap<Integer,String>(); // HashMap 생성
		
		for(int i=0; i<msg.length; i++){
			map.put(i, msg[i]); // 맵에 저장
		}
		
		Set<Integer> keys = map.keySet();
		
		for(Integer n : keys)
			out.println(map.get(n)); // 맵에서 읽어 오기
		
		
		
		
	}

}
