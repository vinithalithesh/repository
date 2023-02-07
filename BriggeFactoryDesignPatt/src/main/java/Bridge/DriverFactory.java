package Bridge;

public class DriverFactory {
	
	
	public static WebActions driverFactory(DriverTypes type) {
		
		switch(type) {
			case Playwright : return new PlaywrightImpl();
			case Webdriver : return new WebDriverImpl();
			case Cypress : return new CypressImpl();
			default : return null;
		}
		
	}

}
