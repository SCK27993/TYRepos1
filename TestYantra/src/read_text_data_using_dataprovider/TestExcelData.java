package read_text_data_using_dataprovider;

import org.testng.annotations.Test;

public class TestExcelData {

	@Test(dataProvider="dataprovider",dataProviderClass = Read_2D_data.class)
	public void getData(String testcaseNo , String result) {
		System.out.println("test case no. : " + " " +  testcaseNo + " , " +  "result : " + " " + result);
	}
}
