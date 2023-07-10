package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 Thread.sleep(2000);
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
           driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
           driver.findElement(By.xpath("//span[text()='Cart']")).click();
           driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
	}

}
