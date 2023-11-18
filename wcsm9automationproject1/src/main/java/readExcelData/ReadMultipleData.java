package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		   //provide the path of excel file
				FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
				
			   // To make the file ready to read
				Workbook wb = WorkbookFactory.create(fis);
				
			   Sheet sheet = wb.getSheet("IPL");// to get into perticular sheet
			   
			   int rc = sheet.getLastRowNum();// to get the no of rows
			   
				for(int i=1;i<=rc;i++ )
				{		
				Row row = sheet.getRow(i);  // to get into perticular row
				Cell cell = row.getCell(0); // to get into perticular coloum
				String data = cell.getStringCellValue(); // to read the specific data from a perticular cell
				System.out.println(data);
				}		   

	
	}

}
