package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class htmlFrame {

	public static void main(String[] args) {
		// handle created login page 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///C:/Users/ASUS/Desktop/Selenium%20DATA/mainFrame.html");
		 driver.findElement(By.id("a1")).sendKeys("bhakti");
		//switch your control to  frame 
		       driver.switchTo().frame(0);
		 
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='j1']"))).sendKeys("1123");
			
		

	}

}
