package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAssignment {
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("guest");
	ChromeDriver driver = new ChromeDriver(option);
	
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
	
	//click contacts
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	
	//click merge contact
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	
	//click fromcontact widget
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
	
	//switch to child window
	
	String parentWindow = driver.getWindowHandle();
	Set<String> childWindow = driver.getWindowHandles();
	List<String>list = new ArrayList<String>(childWindow);
	driver.switchTo().window(list.get(1));
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	driver.switchTo().window(list.get(0));
	
	
	
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	String parentWindow1 = driver.getWindowHandle();
	Set<String>allwindow = driver.getWindowHandles();
	for (String childwindow1 : allwindow) {
		if(!childwindow1.equals(parentWindow1));
		driver.switchTo().window(childwindow1);
	}
	
Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	driver.switchTo().window(parentWindow1);
	driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
	
	driver.switchTo().alert().accept();
	
	String title = driver.getTitle();
	System.out.println(title);
	

}
}