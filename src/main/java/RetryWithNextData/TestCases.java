package assessment1Retry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.HandleProperties;

public class TestCases {
	ChromeDriver driver;
	
	@Test(dataProviderClass = UserDataProvider.class, dataProvider = "main")
	public void testCases(String userName, String pwd) {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		String dp = result.isSuccess() ? "main" : "retry";
		HandleProperties.updateConfigProperties("Dataprovider", dp);
		driver.quit();
	}

}