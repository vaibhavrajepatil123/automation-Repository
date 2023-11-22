package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib1 {
     
	public String readExcelData(String path,String sheetName,int rownumber,int cellnumber) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rownumber);
		  Cell cell = row.getCell(cellnumber);
		  
		String  data=null;
		
		if(cell.getCellType()==cell.getCellType().STRING)
		{
			data=cell.getStringCellValue();
		}	
		else if (cell.getCellType()==cell.getCellType().NUMERIC)
		{
			cell.getStringCellValue().valueOf(cell.getNumericCellValue());
		}
		return data;
	}
	public void writeExcelData(String path,String sheetName,int rowNO,int cellNo,String data) throws EncryptedDocumentException, IOException
	{ 
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		  Row row = sheet.createRow(rowNO);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		
	}
	
	public int rowcount(String path,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
		
	}
}
