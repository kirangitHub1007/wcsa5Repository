package data_Driven_Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	//to store generic reusable methods
	//non static method
	
	//Generic method to read excel data
	
	public String readExcelData(String excelpath,String sheetname,int rowc,int cellc) throws EncryptedDocumentException, IOException
	{  
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
			Row row = sheet.getRow(rowc);
			Cell cell = row.getCell(cellc);
			 String data = cell.getStringCellValue();
			 return data;
		
	}
	
	//generic method to get last row count
	
	public int getLastRowCount(String  excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
	int rc = sheet.getLastRowNum();
	return rc;
	}
	
	//generic method for write data in excel sheet
	
	public void writeExcelData(String excelpath,String sheetname,int rowc,int cellc,String data ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
			Row row = sheet.getRow(rowc);
			Cell cell = row.createCell(cellc);
			cell.setCellValue(data);
			//create obj of file output stream
			FileOutputStream fos = new FileOutputStream(excelpath);
			wb.write(fos);
	}
}
