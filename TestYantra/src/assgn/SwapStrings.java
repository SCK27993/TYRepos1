package assgn;

import java.util.Scanner;

public class SwapStrings {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String first=s.next();
		System.out.println("Enter 2nd String");
		String second=s.next();
		swap(first,second);
	}
		public static void swap(String first,String second)
		{
			
			System.out.println("Before Swap: "+first+"\t"+second);
			first=second+first;
			second=first.substring(first.length()-second.length());
			first=first.substring(0,second.length());
			System.out.println("After Swap: "+first+"\t"+second);
		}
		
	

}

