package make_My_Trip;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {

	@BeforeTest
	public void setProperties() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	@Test
	public void TestA() throws Exception {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//Actions act=new Actions(driver);
		driver.findElement(By.xpath("//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@aria-label='Top Cities : Bangalore, India ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys("Goa, India");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		String sdate = driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).getText();
		System.out.println(sdate);
	}
}
