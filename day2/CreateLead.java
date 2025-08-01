package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {
public static void main(String[] args) {
	

	ChromeOptions options = new ChromeOptions();

	options.addArguments("guest");
	// Launch the browser
	ChromeDriver driver = new ChromeDriver(options);
	 //EdgeDriver driver=new EdgeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
	
	//Enter the title
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("LEARN AUTOMATION");
	
	// Click on the Create lead button
     driver.findElement(By.name("submitButton")).click();
     
     //verify title
     WebElement text = driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']"));
     if(text.getText().contains("LEARN AUTOMATION")) {
    	 System.out.println("title field is verified as "+ ' '+ text);
     }
     
}  
}
