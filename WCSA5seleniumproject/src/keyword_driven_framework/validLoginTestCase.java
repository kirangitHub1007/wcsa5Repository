package keyword_driven_framework;

import java.io.IOException;

import org.openqa.selenium.By;

public class validLoginTestCase  extends BestTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TO open browser
		BestTest bt = new BestTest();
		bt.openBrowser();
		 
	      Flib flib = new Flib();
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH, "validcreds", 1, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "validcreds", 1, 2));
		driver.findElement(By.id("loginButton")).click();
		
		
		

	}

}
