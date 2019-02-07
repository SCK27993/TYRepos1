package scenario2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailAgain {

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
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Inbox"));
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='dialog']")));
		driver.findElement(By.xpath("//textarea[@role='combobox']")).sendKeys("vishnuvishmech@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test Mail");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("workhard in silence");
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='gb_b gb_hb gb_R']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		/*Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		Reporter.log(msg, true);
		alert.accept();*/
	}

}
