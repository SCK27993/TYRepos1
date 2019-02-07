package assignment;

import java.util.LinkedList;

public class Assgn6 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Sathviik");
		ll.add("chowgi");
		ll.add("Keelara");
		
		Object[] arr = ll.toArray();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			String str = (String)arr[i];
			System.out.println(str);
		}
		

	}

}
