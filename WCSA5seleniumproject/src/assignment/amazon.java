package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// end to end flow of amazon
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=4062074686871056550&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301452&hvtargid=kwd-298741529014&hydadcr=5903_2362026");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(" samsung mobile");
		 driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
