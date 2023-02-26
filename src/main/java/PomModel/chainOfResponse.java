package PomModel;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Chain.ManagerApprovalProcess;
import io.github.bonigarcia.wdm.WebDriverManager;

public class chainOfResponse {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =  new ChromeOptions();

		ChromeDriver driver = new ChromeDriver(options);
		
		nxtProcess loginNxtProcess = new Login(driver);
		nxtProcess crmsfaNxtProcess = new CRMSFA(driver);
		nxtProcess clickLeadNxtProcess = new clickLead(driver);
		
		loginNxtProcess.setNext(crmsfaNxtProcess);
		crmsfaNxtProcess.setNext(clickLeadNxtProcess);
		loginNxtProcess.process();
		
	
	}
}
