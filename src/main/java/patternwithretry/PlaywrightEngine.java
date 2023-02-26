package patternwithretry;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightEngine implements EngineRawMetrial {
	
	private Playwright pw;
	private Browser browser;
	private Page page;

	public void launch(String broserName, String aut) {
		pw = Playwright.create();	
	    switch (WebBrowserType.valueOf(broserName.toUpperCase())) {
		case CHROME:
			browser = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
			break;
		case FIREFOX:
			browser = pw.firefox().launch(new BrowserType.LaunchOptions().setChannel("firefox").setHeadless(false));
			break;
		case EDGE:
			browser = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("edge").setHeadless(false));
			break;
		default:
			browser = null;
			break;
		}
		page =  browser.newPage();
		page.navigate(aut);
	}

	public void type(String locator, String text) {
		page.locator(locator).clear();
		page.locator(locator).type(text);
	}

	public void click(String locator) {
		page.locator(locator).click();
	}

	public String getText(String locator) {		
		return page.locator(locator).innerText();
	}

	public void close() {
		browser.close();	
	}

}
