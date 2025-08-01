package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");
		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		//EdgeDriver driver=new EdgeDriver();
		
		//implicitly wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
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

		//Click on the account tab
		driver.findElement(By.xpath("(//a[contains(text(),'Accounts')])[1]")).click();

		//click on create account
		driver.findElement(By.xpath("(//a[contains(text(),'Create Account')])[1]")).click();

		//Enter account name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Dineshkumar Selenium Automation Tester");

		//select computersoftware from industry dropdown
		WebElement industryDropdown = driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
		Select drpdwn = new Select(industryDropdown);
		drpdwn.selectByVisibleText("Computer Software");


		//select s-corporation from ownership dropdown
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipDrpdwn = new Select(ownership);
		ownershipDrpdwn.selectByVisibleText("S-Corporation");

		//select employee from source dropdown
		WebElement sourcedrpdwn = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select source = new Select(sourcedrpdwn);
		source.selectByValue("LEAD_EMPLOYEE");

		//select e commerce from marketing dropdown
		WebElement marketing = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select marketingDrpdwn = new Select(marketing);
		marketingDrpdwn.selectByIndex(5);

		//select texas from state proviences

		WebElement stateProviences = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select stateDropdown = new Select(stateProviences);
		stateDropdown.selectByValue("TX");

		//click create account button

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		//verify the account name

		String accountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		if(accountName.contains("Selenium Automation Tester")){
			System.out.println("text verified as  "+ ' ' + accountName);
		}else {
			System.out.println("text is not matched");
		}



	}
}
