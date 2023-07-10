package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://laptop-fog9skhq/login.do");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
	
	
	
	

	
	
	
	

	}

}
