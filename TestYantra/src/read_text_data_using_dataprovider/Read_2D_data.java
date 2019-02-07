package read_text_data_using_dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Read_2D_data {

	@DataProvider(name= "dataprovider")
	public String[][] dataA() throws Exception, InvalidFormatException, FileNotFoundException, IOException {
		String s = "./dataExcel/book1.xlsx" ;
		Workbook book = WorkbookFactory.create(new FileInputStream(s));
		Sheet sheet = book.getSheet("Sheet1");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
		String[][] arr ;
		arr = new String[sheet.getPhysicalNumberOfRows()-1][sheet.getRow(0).getLastCellNum()];
		for(int i = 1 ; i < sheet.getPhysicalNumberOfRows();i++) {
			for(int j=0 ; j < sheet.getRow(i).getLastCellNum();j++ ) {
				Cell data = sheet.getRow(i).getCell(j);
				//System.out.println(data);
				arr[i-1][j]=data.toString();
				//System.out.println(arr[i-1][j]);
			}
		}
		return arr;	
	}
}
