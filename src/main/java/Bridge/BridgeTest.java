package Bridge;

public class BridgeTest {
	
	public static void main(String[] args) {
		
		//WebDriverImpl impl = new WebDriverImpl();
		//PlaywrightImpl impl = new PlaywrightImpl();
		WebActions impl = DriverFactory.driverFactory(DriverTypes.Webdriver);
		impl.launch("http://leaftaps.com/opentaps");
		impl.type("//input[@id='username']", "demosalesmanager");
		impl.type("//input[@id='password']", "crmsfa");
		impl.click("//input[@class='decorativeSubmit']");
		impl.click("//div[@for=\"crmsfa\"]");
		impl.click("//a[text()=\"Leads\"]");
		impl.click("//a[text()=\"Create Lead\"]");
		impl.type("//input[@id='createLeadForm_companyName']", "FutureArchitect");
		impl.type("//input[@id='createLeadForm_firstName']", "Vinitha");
		impl.type("//input[@id='createLeadForm_lastName']", "K");
		impl.click("//input[@value='Create Lead']");
		impl.close();
	}

}
