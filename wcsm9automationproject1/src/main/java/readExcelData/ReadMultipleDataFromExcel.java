package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
       //Read multiple data from test data from TestData.xlsx
		for(int i=1;i<=3;i++ )
		{		
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		  Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);
		}
	}

}
