package PomModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login implements nxtProcess {
	
	private nxtProcess nextProcess;
	private WebDriver driver;
	Login(WebDriver driver){
		this.driver = driver;
	}
	
	@Override
	public void setNext(nxtProcess nextProcess) {
		
		this.nextProcess = nextProcess;
			
		
	}

	@Override
	public boolean process() {

		
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Login");
		
		return nextProcess.process();
	}
		

	

}
