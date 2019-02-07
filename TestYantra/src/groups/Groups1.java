package groups;

import org.testng.annotations.Test;

public class Groups1 {
	
	@Test(groups="functionalTC")
	public void testA() {
		System.out.println("Functional testcase starts executing...!!");
	}
	
	@Test(groups="smokeTC")
	public void testB() {
		System.out.println("smoke testcase starts executing...!!");
	}
	
	@Test(groups="regressionTC")
	public void testC() {
		System.out.println("regression  testcase strts executing...!!");
	}

}
