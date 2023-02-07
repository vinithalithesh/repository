package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserImplementation implements Browser{

	WebDriver driver;
	@Override
	public WebDriver launch() {
		driver=new EdgeDriver();
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

