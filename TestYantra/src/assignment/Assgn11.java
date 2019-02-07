package assignment;

import java.util.Iterator;
import java.util.LinkedList;

public class Assgn11 {

	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Sathvik");
		ll.add("chowgi");
		ll.add("Keelara");
		ll.add("success");
		ll.add("comes from");
		ll.add("Knowledge");
		
		Iterator<String> t = ll.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}

}
