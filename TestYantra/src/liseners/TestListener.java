package liseners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(DemoListener.class)
public class TestListener {

	@Test
	public void testA() {
		Assert.fail();
		System.out.println("TestA execution completed...!!!");
	}
	@Test
	public void testB() {
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(214,412);
		System.out.println("TestB 1 execution completed...!!!");
		soft.assertEquals(214,412);
		System.out.println("TestB 2 execution completed...!!!");
		soft.assertEquals(214,412);
		System.out.println("TestB 3 execution completed...!!!");
		soft.assertEquals(214,412);
		soft.assertAll();
		System.out.println("TestB 4 execution completed...!!!");
	}
	
}
