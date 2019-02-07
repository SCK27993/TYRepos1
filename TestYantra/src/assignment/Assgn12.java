package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assgn12 {

	public static void main(String[] args) {
		
		HashSet<String> s1 = new HashSet<>();
		s1.add("Sathvik");
		s1.add("chowgi");
		s1.add("keelara");
		
		Set<String> s2 = s1 ;
		
		Iterator<String> t = s2.iterator();
		
		while(t.hasNext()){
			System.out.println(t.next());
		}
		
	}

}
