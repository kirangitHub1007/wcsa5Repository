package data_Driven_Framework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// to login actitime with invalid creads 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://laptop-fog9skhq/login.do");
		 //create obj of flib class
		 Flib flib = new Flib();
		 
		 for(int i = 1;i<=5;i++)
		 {
			 String invalidusn = flib.readExcelData("./data/actitimeTestData.xlsx", "invalidcreds", i, 0);
				String invalidpsw = flib.readExcelData("./data/actitimeTestData.xlsx", "invalidcreds", i, 1);
				// identify webelement 
				driver.findElement(By.name("username")).sendKeys(invalidusn);
				driver.findElement(By.name("pwd")).sendKeys(invalidpsw);
				driver.findElement(By.id("loginButton")).click();
				driver.findElement(By.name("username")).clear();
				
				
		 }
		 

	}

}
