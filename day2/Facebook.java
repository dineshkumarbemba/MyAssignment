package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	//launch url
	driver.get("https://en-gb.facebook.com/");
	
	//maximize window
	driver.manage().window().maximize();
	
	//implicitly wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//click create new account
	driver.findElement(By.linkText("Create new account")).click();
	
	//Enter firstName
	driver.findElement(By.name("firstname")).sendKeys("Dineshkumar");
	
	//Enter LastName
	driver.findElement(By.name("lastname")).sendKeys("Thangavelu");
	
	//Select day dropdown
	WebElement day = driver.findElement(By.id("day"));	
	Select setday = new Select(day);	
	setday.selectByVisibleText("27");
	
	//Select month dropdown
	WebElement month = driver.findElement(By.id("month"));	
	Select monthdrpdwn = new Select(month);	
	monthdrpdwn.selectByValue("7");
	
	//Select year dropdown
	WebElement year = driver.findElement(By.id("year"));	
	Select yeardrpdwn = new Select(year);	
	monthdrpdwn.selectByIndex(31);
	
	//click gender radiobutton
	driver.findElement(By.xpath("//input[@id='sex']")).click();
	
	//Enter emailid
	driver.findElement(By.name("reg_email__")).sendKeys("dineshkumar.t@hcl.com");
	
	//Enter Password
	driver.findElement(By.id("password_step_input")).sendKeys("F&ceBoo*k@");
	
	//click submit button
	driver.findElement(By.name("websubmit")).click();

	
}
}
