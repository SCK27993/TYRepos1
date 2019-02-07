package bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class BlueStone4 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.switchTo().frame("wiz-iframe");
		driver.findElement(By.className("CT_BannerClose")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		driver.switchTo().frame("livechat-compact-view");
		Thread.sleep(2000);
		driver.findElement(By.id("open-label")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Arjun Reddy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='email']/following::input[@id='email']")).sendKeys("arjunreddyGO@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("container_4_4")).sendKeys("9951711179");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		

	}

}
