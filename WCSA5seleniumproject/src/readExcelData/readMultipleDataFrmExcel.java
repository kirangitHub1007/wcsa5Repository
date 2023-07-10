package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readMultipleDataFrmExcel {
// read multiple data by using for loop
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

      // to read multiple value
		
		for(int i=1;i<=10;i++)
		{
			FileInputStream FIS = new FileInputStream("./data/testData.xlsx");
			
			//making file to read 
			Workbook WB = WorkbookFactory.create(FIS);
			
			//to get sheet
			Sheet sheet = WB.getSheet("IPL");
			
	       //to get desired row(pass row i.e i)
			Row row = sheet.getRow(i);
			
			//to get desired cell or column
			Cell cell = row.getCell(0);
			 
			//to read value from cell f
			
			String data = cell.getStringCellValue();
			System.out.println(data);
		}
	}

}
