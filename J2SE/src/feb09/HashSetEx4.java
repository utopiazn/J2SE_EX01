package feb09;

import java.util.*;

public class HashSetEx4 {
	
	public static void main(String[] args){
		
		HashSet<Object> set = new HashSet<Object>();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("Davud",10));
		set.add(new Person2("Davud",10));
		
		
		System.out.println(set);
		
	}

}


class Person2{
	
	String name;
	int age;
	
	Person2(String name, int age){
		
		this.name = name;
		this.age = age;
		
	}
	
	public boolean equals(Object obj){
		
		if(obj instanceof Person2){
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name)&& age== tmp.age;
		}
		
		
		return false;
	}
	
	public int hashCode(){
		return name.hashCode()+age;
	}
	
	public String toString(){
		return name+":"+ age;
	}
	
}



/*
[abc, Davud:10]

 */
