package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgrounddropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");

		// To maximise the windows
		driver.manage().window().maximize();

		// step1: locate the select tag(parent)
		// we need to find which locator can be used
		// we need to create class
		WebElement findElement = driver.findElement(By.id("dropdown1"));
		Select dropdown = new Select(findElement);

		// select the value using visible text->working in only english
		// using selectByVisibleText -black color text

		dropdown.selectByVisibleText("Conference");

		// we can select the value using index value also but knowing index methods

		dropdown.selectByIndex(0);

		// select by value using select by value-Blue color text

		dropdown.selectByValue("LEAD_DIRECTMAIL");

		// dropdown for deselecting the values
		dropdown.deselectAll();
		dropdown.deselectByIndex(0);
		dropdown.deselectByValue("");
		dropdown.deselectByVisibleText("");

	}

}
