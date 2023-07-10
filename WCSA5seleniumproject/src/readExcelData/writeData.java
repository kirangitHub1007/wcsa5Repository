package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TO write a data in excel sheet
		
	   //to provide path of file
				FileInputStream FIS = new FileInputStream("./data/testData.xlsx");
				
	   //making file to read 
				Workbook WB = WorkbookFactory.create(FIS);
				
	  //to get sheet
				 Sheet sheet = WB.getSheet("IPL");
		//to get row
				Row row = sheet.getRow(1);
		// to create cell  using row (i)
				Cell cell = row.createCell(2);
		//to write data in cell
				cell.setCellValue("pune");
				
		//create obj of FileOutputStream 
				FileOutputStream fos = new FileOutputStream("./data/testData.xlsx");
				
		// TO WRITE data in excel
				WB.write(fos);


	}

}
