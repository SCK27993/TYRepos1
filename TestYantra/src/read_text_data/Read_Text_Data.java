package read_text_data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_Text_Data {

	public static void main(String[] args) {
		try {
			File file = new File("./dataText/book1.txt");
			Scanner s = new Scanner(file);
			while(s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
			s.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
