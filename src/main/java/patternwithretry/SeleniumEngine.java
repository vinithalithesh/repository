package patternwithretry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumEngine implements EngineRawMetrial {

	private WebDriver driver;

	public void launch(String broserName, String aut) {
		switch (WebBrowserType.valueOf(broserName.toUpperCase())) {
		case CHROME:
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case EDGE:
			driver = new EdgeDriver();
			break;
		default:
			driver = null;
			break;
		}
		driver.manage().window().maximize();
		driver.get(aut);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void type(String locator, String text) {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(text);
	}

	public void click(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public String getText(String locator) {
		return driver.findElement(By.xpath(locator)).getText();
	}

	public void close() {
		driver.close();
	}

}