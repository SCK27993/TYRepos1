package assignment;

import java.util.ArrayList;

public class Assgn3 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("sathvik");
		al.add("chowgi");
		al.add("keelara");
		
		Object[] arr = al.toArray();
		for(int i = 0 ; i < arr.length ; i++) {
			String temp = (String)arr[i];
			System.out.println(temp);
		}
	}
}
