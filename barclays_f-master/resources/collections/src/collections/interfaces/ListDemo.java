package collections.interfaces;

import java.util.ArrayList;
import java.util.List;


public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("element1");
		list.add("element1");
		list.add("element2");
		list.add("element2");
		list.add(null);
		list.add(null);
		
		//System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		
		
	}
}
