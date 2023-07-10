package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestoneAss {

	public static void main(String[] args) throws InterruptedException {
		// trial to click bluestone.com Chat box
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQjwnMWkBhDLARIsAHBOftoLObBYpXeJcCaLLaOUitI51sD4IgVZolcxnS4TrqYY-qzI5pLFF00aAkiWEALw_wcB");
        driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
        
        //this script will not work coz chatbox is a frame 
	}

}
