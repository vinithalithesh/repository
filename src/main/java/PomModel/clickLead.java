package PomModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickLead implements nxtProcess{
	private nxtProcess nextProcess;
	
	private WebDriver driver;
	clickLead(WebDriver driver){
		this.driver = driver;
	}
	@Override
	public void setNext(nxtProcess nextProcess) {
		this.nextProcess = nextProcess;
		
	}

	@Override
	public boolean process() {
		System.out.println("Click Lead");
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.close();
		return  nextProcess.process();
	}
}
