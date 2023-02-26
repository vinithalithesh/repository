package PomModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMSFA implements nxtProcess{
	private nxtProcess nextProcess;
	
	private WebDriver driver;
	CRMSFA(WebDriver driver){
		this.driver = driver;
	}
	@Override
public void setNext(nxtProcess nextProcess) {
		this.nextProcess = nextProcess;
		
			
		}

	@Override
	public boolean process() {
		System.out.println("CRMSFA");
		driver.findElement(By.linkText("CRM/SFA")).click();
		return nextProcess.process();
	}
	
}