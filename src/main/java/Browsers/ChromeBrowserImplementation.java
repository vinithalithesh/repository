package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserImplementation implements Browser{

	WebDriver driver;
	@Override
	public WebDriver launch() {
		driver=new ChromeDriver();
		return driver;
	}

	@Override
	public void navigate(String url) {
		driver.get(url);
		
	}

	@Override
	public void quit() {
		driver.quit();
		
	}

}
