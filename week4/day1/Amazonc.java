package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonc {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	List<Integer>price = new ArrayList<Integer>();
	for (WebElement p : phones) {
		String pricetext = p.getText().replaceAll("[^0-9]", "");
		System.out.println(pricetext);
		price.add(Integer.parseInt(pricetext));
	} 	
Collections.sort(price);
System.out.println("least price in amazon phone search is  "+price.get(0));
	
}
}
