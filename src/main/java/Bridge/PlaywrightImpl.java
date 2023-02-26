package Bridge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightImpl implements WebActions{

	private Playwright pw;
	private Browser browser;
	private Page page;
	
	@Override
	public void launch(String url) {
		pw = Playwright.create();
		browser = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		page = browser.newPage();
		page.navigate(url);
	}

	@Override
	public void type(String locator, String text) {
		page.locator(locator).clear();
		page.locator(locator).type(text);
	}

	@Override
	public void click(String locator) {
		page.locator(locator).click();
	}

	@Override
	public String getText(String locator) {
		return page.locator(locator).innerText();
	}

	@Override
	public void close() {
		pw.close();
	}

}
