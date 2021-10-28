package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSalseforce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// MAXIMISE WINDOW
		driver.manage().window().maximize();
		driver.get("  https://www.salesforce.com/in/form/signup/freetrial-sales/?");
		Thread.sleep(5000);
		driver.findElement(By.name("UserFirstName")).sendKeys("MOhan");
		driver.findElement(By.name("UserLastName")).sendKeys("Pandian");
		driver.findElement(By.name("UserEmail")).sendKeys("Mohan@gmail.com");
		driver.findElement(By.name("UserTitle")).sendKeys("Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("Cognizant");
		driver.findElement(By.name("CompanyEmployees")).sendKeys("1 - 20 employees");
		driver.findElement(By.name("UserPhone")).sendKeys("9876854321");
		driver.findElement(By.name("CompanyCountry")).sendKeys("44");
		Thread.sleep(3000);

		driver.close();
	}

}
