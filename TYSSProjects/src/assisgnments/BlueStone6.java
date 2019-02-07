package assisgnments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BlueStone6 {
	
	@BeforeTest
	public void sProperty()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public static void test() throws Throwable {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//header[@class='white-header white-bg']/div/div[@class='bottom-header']/div/nav/ul/li[@class='menuparent offers-menuparent pull-right']/a"))).perform();
		Thread.sleep(1000);
		String ttext = driver.findElement(By.xpath("//header[@class='white-header white-bg']//span[text()='75% off on Making Charge']")).getText();
		System.out.println(ttext);
		driver.findElement(By.xpath("//header[@class='white-header white-bg']//span[text()='75% off on Making Charge']")).click();
		Thread.sleep(2000);
		String ptext = driver.findElement(By.xpath("//div[@id='content-column']//span[@class='offer']/span[text()='75% off on making charge']")).getText();
		System.out.println(ptext);
		String tttext = ttext.toUpperCase();
		System.out.println(tttext);
		if(tttext.equalsIgnoreCase(ptext)) {
			System.out.println("products verified");
		}
		else {
			System.out.println("products verification failed");
		}
		Assert.assertEquals(tttext, ptext);
		driver.close();
	}

}
