package Dropdown_handlimg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
	
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/ASUS/Desktop/Selenium%20DATA/drop_down.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
	WebElement dropdown = driver.findElement(By.id("menu"));
 //to handle dropdown : creating object of Select class
	 Select sel = new Select(dropdown);
	 sel.selectByIndex(2);
	 
	// sel.selectByValue("v3");
	 
	 sel.selectByVisibleText("paav bhaji");
		 
		 

	}

}
