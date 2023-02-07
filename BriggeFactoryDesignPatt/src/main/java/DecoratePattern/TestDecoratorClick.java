package DecoratePattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Factory.Browser;
import Factory.BrowserFactory;
import Factory.BrowserType;

public class TestDecoratorClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Browser browser = BrowserFactory.getBrowser(BrowserType.CHOME);
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		WebElement findElement = driver.findElement(By.className("decorativeSubmit"));
		
		ElementDecorator elementDecorator = new ElementDecorator(driver, findElement);
		elementDecorator.click();
		driver.close();
		
		

	}

}
