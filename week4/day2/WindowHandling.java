package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notification");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://www.irctc.co.in/nget/train-search");
	//driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[text()='OK']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.linkText("FLIGHTS")).click();
	String parentWindow = driver.getWindowHandle();
	Set<String> childWindow = driver.getWindowHandles();
	
	List<String>allWindow = new ArrayList<String>(childWindow);
	
	
	driver.switchTo().window(parentWindow);
	driver.close();
	
	
	
	
}
}
