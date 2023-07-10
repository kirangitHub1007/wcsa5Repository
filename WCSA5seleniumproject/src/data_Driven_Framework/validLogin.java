package data_Driven_Framework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TO login into actitime with valid inputs
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://laptop-fog9skhq/login.do");
		 
		 //to read data from excel we need to create obj of flib class
		Flib flib = new Flib();
		String validusn = flib.readExcelData("./data/actitimeTestData.xlsx", "validcreds", 1, 0);
		String validpsw = flib.readExcelData("./data/actitimeTestData.xlsx", "validcreds", 1, 2);
		// identify webelement 
		driver.findElement(By.name("username")).sendKeys(validusn);
		driver.findElement(By.name("pwd")).sendKeys(validpsw);
		driver.findElement(By.id("loginButton")).click();
		

	}

}
