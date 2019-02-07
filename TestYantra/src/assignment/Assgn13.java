package assignment;

import java.util.HashSet;
import java.util.Iterator;

public class Assgn13 {

	public static void main(String[] args) {
		
		HashSet<String> s1 = new HashSet<>();
		s1.add("Sathvik");
		s1.add("chowgi");
		s1.add("keelara");
		
		HashSet<String>  s2 = new HashSet<>();
		
		s2.add("Sathvik");
		s2.add("chowdaiah");
		s2.add("gita");
		
		s1.addAll(s2);
		
		System.out.println(s1.size());
		
		Iterator<String> t = s1.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}

	}

}
