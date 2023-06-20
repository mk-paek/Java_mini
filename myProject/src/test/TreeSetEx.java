package test;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("melon");
		treeSet.add("peach");
		treeSet.add("cherry");
		treeSet.add("grape");
		treeSet.add("kiwi");
		treeSet.add("mango");
		
		System.out.println("[c~k 사이의 과일 이름 검색");
		NavigableSet<String> rangeSet = treeSet.subSet("a", true, "n", true);
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}

}
