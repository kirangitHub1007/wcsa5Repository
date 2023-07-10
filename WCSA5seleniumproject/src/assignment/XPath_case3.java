package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_case3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 Thread.sleep(2000);
		 
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("bhakti");
		 // case 3= by contains function
		 driver.findElement(By.xpath("//button[contains(@value,'1')] ")).click();
		 driver.close();


	}

}
