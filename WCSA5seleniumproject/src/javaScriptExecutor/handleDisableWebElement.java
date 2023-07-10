package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleDisableWebElement {

	public static void main(String[] args) {
		// To handle disable web element
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
	
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/ASUS/Desktop/Selenium%20DATA/disabledWebelement.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //To handle disable web element
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("document.getElementById('i2').value='bhakti'");
		
		 
	}

}
