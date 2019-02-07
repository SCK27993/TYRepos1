package two_dimensional_array;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Scanner_class_Data_Provider {

	public static Scanner s = new Scanner(System.in);
	@DataProvider(name = "dataprovider")
	public String[][] genData(){
		System.out.print("Enter the number of rows within array : ");
		int rows = s.nextInt();
		System.out.print("Enter the number of columns within array : ");
		int columns = s.nextInt();
		String[][] data = new String[rows][columns] ;
		for(int i = 0 ; i < data.length ; i++) {
			for(int j = 0 ; j < data.length ; j++) {
				System.out.println("Enter the value to be stored at index (" + i + " , " + j + " )   : ");
				data[i][j] = s.next();
			}
		}
		return data ;
	}
	@Test(dataProvider = "dataprovider")
	public void createUser(String un,String pw) {
		Reporter.log("Username" + un + "password" + pw,true);
	}
}
