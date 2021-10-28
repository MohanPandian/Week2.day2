package week2.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		// step1: locate the select tag(parent)
		// we need to find which locator can be used
		// we need to create class

		// Source(createLeadForm_dataSourceId)

		WebElement findElement2 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		findElement2.sendKeys("Conference");

		// step2: create object for select class
		// it will look for input that is web-element

		Select dropdown = new Select(findElement2);

		// step 3: select the value using visible text
		// using selectByVisibleText -black color text

		dropdown.selectByVisibleText("Conference");

		// we can select the value using index value also but knowing index methods

		dropdown.selectByIndex(0);

		// select by value using select by value-Blue color text

		dropdown.selectByValue("LEAD_DIRECTMAIL");

		// dropdwon for deselecting the values
		dropdown.deselectAll();
		dropdown.deselectByIndex(0);
		dropdown.deselectByValue("");
		dropdown.deselectByVisibleText("");

		// createLeadForm_marketingCampaignId(Marketing Campaign)

		/*
		 * WebElement findElement3 =
		 * driver.findElement(By.id("createLeadForm_marketingCampaignId")); Select
		 * dropdown2 =new Select(findElement3);
		 * dropdown2.selectByVisibleText("Car and Driver");
		 * dropdown2.selectByValue("CATRQ_CARNDRIVER");
		 */

		driver.findElement(By.id("createLeadForm_marketingCampaignId")).click();
		driver.findElement(By.xpath("//op")).click();

		// driver.findElement(By.name("submitButton")).click();

		// select a value from drop down which doesnot have select tag
		// driver.findElement(By.xpath("")).click();

		// get option is used to get all the option in checkbox

		// find elements
		// list
		// getoptions

		WebElement findElement3 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(findElement3);
		List<WebElement> options = dd.getOptions();
		System.out.println(options.size());

	}

}
