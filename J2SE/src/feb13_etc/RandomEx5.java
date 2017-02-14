package feb13_etc;

import java.util.*;
import static java.lang.System.out;
public class RandomEx5 {

	public static void main(String[] args){
	
		String[] data = {"A","A","B","B","C"}; // A의 가중치를 다른 값의 두배로 한다.
		
		HashMap map = new HashMap();
		
		for(int i =0; i<100;i++){
			String temp = getRandArr(data); //BBBCBABAAABCAACCBABABCABBBBABABCCBBCAABAABCBCABBBAABCBBABBBCBABBBAABCAACBAABCBAACAAAAACAABACBAABBBAA
			out.print(temp);
			
			if(map.containsKey(temp)){
				Integer value = (Integer)map.get(temp);
				map.put(temp, new Integer(value.intValue()+1));
			}else{
				map.put(temp, new Integer(1));
			}
			
		}
		out.println();
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			String key=(String)it.next();
			Integer value = (Integer)map.get(key);
			int intValue = value.intValue();
			out.println(key + " : " + printGraph('#', intValue) + intValue);
		}
		
	}
	
	
	public static String printGraph(char ch, int value){
		
		char[] bar = new char[value];
		
		for(int i=0;i<bar.length;i++){
			bar[i] = ch;
		}
		
		return new String(bar);
	}
	
	public static String getRandArr(String[] arr){
		return arr[getRand(arr.length-1)];
	}
	
	public static int getRand(int n){
		return getRand(0,n);
	}
	
	public static int getRand(int from,int to){
		
		return (int)(Math.random()*(Math.abs(to-from)+1)) + Math.min(from, to);
	}
	
	
}

/*
A : ###########################################43
B : ################################32
C : #########################25

*/
