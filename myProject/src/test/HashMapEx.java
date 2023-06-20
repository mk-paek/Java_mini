package test;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "이재용"), 100);
		map.put(new Student(1, "이재용"), 100);
		
		System.out.println("총 Map.Entry 갯수: " + map.size());
	}

}
