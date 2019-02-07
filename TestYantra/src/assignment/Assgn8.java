package assignment;

import java.util.LinkedList;

public class Assgn8 {

public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Sathvik");
		ll.add("chowgi");
		ll.add("Keelara");
		ll.add("success");
		ll.add("comes from");
		ll.add("Knowledge");
		System.out.println("Before reversing");
		for(int i = 0 ; i < ll.size() ; i++) {
			String str = ll.get(i);
			System.out.println(str);
		}
		
		LinkedList<String> ll2 = new LinkedList<>();
		
		System.out.println("After reversing");
		
		for(int i = ll.size() ; i >= 0; i--) {
			ll2.add(ll.get(i));
		}
		
		for(int i = 0 ; i < ll2.size() ; i++) {
			String str = ll2.get(i);
			System.out.println(str);
		}
		
	}
}
