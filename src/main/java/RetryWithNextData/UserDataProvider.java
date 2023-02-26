package assessment1Retry;

import org.testng.annotations.DataProvider;

public class UserDataProvider {
	
	@DataProvider(name = "main")
	public String[][] getUserCrendentials() {
		return new String[][] {
			{"DemoSalesManager", "crmsfa"},
			{"DemoSalesManager1", "crmsfa"}
		};
	}
	
	@DataProvider(name = "retry", indices = {1})
	public String[][] getRetryUserCrendentials() {
		return new String[][] {
			{"DemoSalesManager", "crmsfa"},
			{"DemoSalesManager1", "crmsfa"}
		};
	}

}