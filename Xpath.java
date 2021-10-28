package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		// To maximise the windows
		driver.manage().window().maximize();

		// 1. step1 locate the element(used for find single element(web element))
		// 2. Enter UserName and Password
		// 3. Click on Login Button
		WebElement findElement = driver.findElement(By.xpath("//input[@id='username']"));
		findElement.sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Plintron");
			
		//driver.findElement(By.xpath("//input[contains('@id','createLeadForm_firstName')]")).sendKeys("MOHAN");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("MOHAN");
		
			//driver.findElement(By.xpath("//input[contains('@id','createLeadForm_lastName')]")).sendKeys("PANDIAN");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("PANDIAN");
		
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	
		
		
	}

}
