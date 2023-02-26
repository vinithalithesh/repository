package Bridge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutomation {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Babu");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manickam");

		driver.findElement(By.name("submitButton")).click();
		
		

		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(firstName);
		
		driver.close();
	}
}
