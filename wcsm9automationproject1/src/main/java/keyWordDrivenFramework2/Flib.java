package keyWordDrivenFramework2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
       
	//read the data from excel file
	public String readExcelData(String excelPath, String sheetName, int rowNumber,int cellNumber) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		 Row row = sheet.getRow(rowNumber);
		 Cell cell = row.getCell(cellNumber);
		 
		 String data=null;
		 if (cell.getCellType()==cell.getCellType().STRING)
	    {
			data=cell.getStringCellValue();
		}
		 else if (cell.getCellType()==cell.getCellType().NUMERIC)
		{
             data=cell.getStringCellValue().valueOf(cell.getNumericCellValue());
		}
		 return data;
	}
	
	// write the data from excel
	public void writeDataFromExcel(String excelPath, String sheetName,int rowNumber, int cellNumber,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.createRow(rowNumber);
		Cell cell = row.createCell(cellNumber);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
	
	// to find the row count in excel file
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}
	
	//to read the data from property file
	public String readDataFromProperty(String propertyPath, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propertyPath);
		Properties prop = new Properties();
		prop.load(fis);
		 String data = prop.getProperty(key);
		 return data;
	}
	
	
	
	
	
}
