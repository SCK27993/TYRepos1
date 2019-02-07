package assignment;

import java.util.ArrayList;

public class Assgn1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("sathvik");
		al.add("chowgi");
		al.add("keelara");

		Object cal = al.clone();
		ArrayList<String> al2 = (ArrayList<String>) cal ;
		for(int i = 0 ; i < 3 ; i++ ) {
			String st = al2.get(i); 
			System.out.println(st);
		}
	}

}
