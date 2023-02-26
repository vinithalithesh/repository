package patternwithretry;



import org.testng.annotations.Test;

import utils.HandleProperties;


public class BridgeDesignPatternRetryTest {	
	
	String aut = "http://leaftaps.com/opentaps";	
	
	@Test(retryAnalyzer = RetryOnSeleniumEngine.class)
	public void seleniumRetryBridgeTest() {
		
		EngineRawMetrial engine = EngineFactory.engineToRun(HandleProperties.readConfigProperties("Engine"));
		engine.launch(HandleProperties.readConfigProperties("Browser"), aut);
		
		engine.type("//input[@id='username']", "demosalesmanager");
		engine.type("//input[@id='password']", "crmsfa");
		engine.click("//input[@class='decorativeSubmit']");
		engine.click("//a[contains(text(),'CRM/SFA')]");
		engine.click("//a[text()='Leads']");
		engine.click("//a[text()='Create Lead']");
		engine.type("//input[@id='createLeadForm_companyName']", "Group");
		engine.type("//input[@id='createLeadForm_firstName']", "6");
		engine.type("//input[@id='createLeadForm_lastName']", "Group6");
		engine.type("//input[@id='createLeadForm_primaryEmail']", "Group@testleaf.com");
		engine.click("//input[@name='submitButton']");
		System.out.println(engine.getText("//span[@id='viewLead_companyName_sp']"));
		engine.close();		
		
	}
	

}