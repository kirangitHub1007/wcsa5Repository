package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_case2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 Thread.sleep(2000);
		 
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("bhakti");
		 // case 2 = by text function
		 driver.findElement(By.xpath("//button[text() = 'Log in'] ")).click();
		 driver.close();
		 
		 
	}

}
