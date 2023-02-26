package retrybrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import utils.HandleProperties;

public class RetryBrowserTest {
	
	private WebDriver driver;
	
	@Test(retryAnalyzer = Retry.class)
	public void test() {
		driver = BrowserFactory.launch(HandleProperties.readConfigProperties("Browser"));
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit1")).click();
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void tearDown() { driver.quit(); }
	
	@AfterSuite
	public void afterSuite() { HandleProperties.updateConfigProperties("Browser", "Chrome");}

}