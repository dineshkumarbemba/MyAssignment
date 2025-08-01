package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
	
	ChromeOptions options = new ChromeOptions();

	options.addArguments("guest");
	// Launch the browser
	ChromeDriver driver = new ChromeDriver(options);
	 //EdgeDriver driver=new EdgeDriver();

	// Load the url - get
	driver.get("http://leaftaps.com/opentaps/control/main");

	// Maximize the browser
	driver.manage().window().maximize();

	driver.findElement(By.id("username")).sendKeys("DemoCSR");

	// Enter the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");

	// Click the Login button
	driver.findElement(By.className("decorativeSubmit")).click();

	// Clcik on the CRMSFA link
	driver.findElement(By.partialLinkText("CRM")).click();

	// Click on the Leads link
	driver.findElement(By.linkText("Leads")).click();

	// Click on the Create Lead link
	driver.findElement(By.linkText("Create Lead")).click();

	// Enter company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

	// Enter first name
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dineshkumar");

	// Enter the last name
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangavelu");

	// Step1: Find the dropdown element
	WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));

	// Step2: Select-Create an Object
	Select dropdown = new Select(sourceElement);

	// Step3: Use the method to Select - 3 Methods
	// dropdown.selectByIndex(4);
	// dropdown.selectByVisibleText("Conference");
	dropdown.selectByValue("LEAD_DIRECTMAIL");
	
	//industry dropdown
	
	WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select industry = new Select(industryDropdown);
	industry.selectByValue("IND_DISTRIBUTION");

	
	
	
	// Click on the Create lead button
	//      driver.findElement(By.name("submitButton")).click();
}
}
