package Browsers;

import org.openqa.selenium.WebDriver;

public interface Browser {
	public WebDriver launch();
	public void navigate(String url);
	public void quit();

}
