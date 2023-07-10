package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.instagram.com/");
		 driver.findElement(By.xpath("//input[@ name='username']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@ name='password']")).sendKeys("123456789");
		// Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
