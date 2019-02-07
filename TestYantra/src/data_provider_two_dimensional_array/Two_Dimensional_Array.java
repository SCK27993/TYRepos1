package data_provider_two_dimensional_array;

import java.util.Scanner;

public class Two_Dimensional_Array {

	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the number of rows : ");
		int rows = s.nextInt();
		System.out.print("Enter the number of columns : ");
		int columns = s.nextInt();
		int[][] a = new int[rows][columns] ;
		for(int i = 0 ; i < a.length ; i++  ) {
			for(int j = 0 ; j < a.length ; j++) {
				System.out.print("Enter the values to be entered into array : " + i + " , " + j + " : ");
				a[i][j]= s.nextInt();
			}
		}
		System.out.print("The entered two - dimensional array is : ");
		for(int i = 0 ; i < a.length ; i++  ) {
			for(int j = 0 ; j < a.length ; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
