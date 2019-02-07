package assignment;

import java.util.LinkedList;
import java.util.List;

public class Assgn7 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Sathvik");
		ll.add("chowgi");
		ll.add("Keelara");
		ll.add("success");
		ll.add("comes from");
		ll.add("Knowledge");
		
		List<String> ll2 = ll.subList(1,5);
		
		for(int i = 0 ; i < ll2.size() ; i++) {
			String str = ll2.get(i);
			System.out.println(str);
		}

	}

}
