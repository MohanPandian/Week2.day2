package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		// To maximise the windows
		driver.manage().window().maximize();

		// 1. step1 locate the element(used for find single element(web element))
		// 2. Enter UserName and Password
		// 3. Click on Login Button
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4.Click on CRM/SFA Link
		// 5.Click on Leads Button
		// 6.Click on create Lead Button

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Plintron");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MOHAN");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("PANDIAN");
	
		
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown =new Select(findElement2);
		dropdown.selectByVisibleText("Direct Mail");
		
		WebElement findElement3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown2 =new Select(findElement3);
		dropdown2.selectByIndex(7);
		
		WebElement findElement4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown4 =new Select(findElement4);
		dropdown4.selectByValue("OWN_PARTNERSHIP");
		
			
	    driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Car and Driver");
		
		

	}

}
