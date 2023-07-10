package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
// TO read data from IPL sheet	
		
        //to provide path of file
		FileInputStream FIS = new FileInputStream("./data/testData.xlsx");
		
		//making file to read 
		Workbook WB = WorkbookFactory.create(FIS);
		
		//to get sheet
		Sheet sheet = WB.getSheet("IPL");
		
       //to get desired row
		Row row = sheet.getRow(2);
		
		//to get desired cell 
		Cell cell = row.getCell(1);
		//to read value from cell
		
		String data = cell.getStringCellValue();
		
		System.out.println(data);
		
		
	}

}
