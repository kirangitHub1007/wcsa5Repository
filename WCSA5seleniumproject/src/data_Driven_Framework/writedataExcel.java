package data_Driven_Framework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writedataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TO write data ni excel using generic method
		
		
		 //create obbj of flib class
		 Flib flib = new Flib();
		 flib.writeExcelData("./data/testData.xlsx","IPL", 2, 3, "bhakti");
	}

}
