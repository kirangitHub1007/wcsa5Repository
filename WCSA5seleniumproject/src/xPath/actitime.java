package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://laptop-fog9skhq/login.do");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@ id = 'loginButton'] ")).click();
		 
		 
		 
		 
		 
	}

}
