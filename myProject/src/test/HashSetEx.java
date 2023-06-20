package test;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("김정후", 23));
		set.add(new Member("김정후", 23));
		
		System.out.println("총 객체의 수: " + set.size());
	}

}
