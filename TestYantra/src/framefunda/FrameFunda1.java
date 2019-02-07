package framefunda;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameFunda1 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public WebElement element(WebDriver driver1, String loc, String str) {
		
		
		String id = null;
		if(loc.equals(id)) {
			WebElement ele = driver1.findElement(By.loc(str));
		}
		Object tagName;
		elseif(loc.equals(tagName)){
			WebElement ele = driver1.findElement(By.tagname(str));
		}
	}

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		element(driver,id);
		driver.findElement(By.)

	}

}
