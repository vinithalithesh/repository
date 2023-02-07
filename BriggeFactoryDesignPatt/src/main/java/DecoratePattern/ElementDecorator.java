package DecoratePattern;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementDecorator extends RemoteWebElement {

	private WebElement ele;
	private WebDriverWait wait;
	
	public ElementDecorator(WebDriver driver, WebElement ele) {
		this.ele = ele;
	
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	}
	
	@Override
	public void click()
	{
		ele.click();
		
	}
	public void waitForClick() {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}
