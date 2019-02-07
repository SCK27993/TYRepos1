package scenario1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gmail {

	@BeforeClass
	public void setProperty() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	
	@Test
	public void testA() throws Exception {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chowgisathvikusn099");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("X5e6L7h$1");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@role='checkbox']")).click();
		String text = driver.findElement(By.xpath("//span[@class='x8']/b")).getText();
		Reporter.log(text,true);
	}
}
