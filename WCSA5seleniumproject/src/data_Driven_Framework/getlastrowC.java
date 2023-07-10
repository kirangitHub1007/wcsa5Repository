package data_Driven_Framework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlastrowC {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TO get ladt row count 
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://laptop-fog9skhq/login.do");
		 //create obbj of flib class
		 Flib flib = new Flib();
		int rc = flib.getLastRowCount("./data/actitimeTestData.xlsx", "invalidcreds");
		 for(int i = 1;i<=rc;i++)
		 {
			 String invalidusn = flib.readExcelData("./data/actitimeTestData.xlsx", "invalidcreds", i, 0);
				String invalidpsw = flib.readExcelData("./data/actitimeTestData.xlsx", "invalidcreds", i, 1);
				// identify webelement 
				driver.findElement(By.name("username")).sendKeys(invalidusn);
				driver.findElement(By.name("pwd")).sendKeys(invalidpsw);
				driver.findElement(By.id("loginButton")).click();
				
				
		 }
		 

	}

}
