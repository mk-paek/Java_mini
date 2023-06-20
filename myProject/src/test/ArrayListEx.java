package test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Hello");
		list.add("Spring");
		list.add("Database");
		list.add("JPA");
		
		
		int size = list.size();
		System.out.println(size);
		
		String spring = list.get(2);
		System.out.println(spring);
		
		list.remove(2);
		
		
	}

}
