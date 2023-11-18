package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToSeeRowCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
           
	   //provide the path of excel file
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		
	   // To make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		
	   Sheet sheet = wb.getSheet("IPL");// to get into perticular sheet
	   
	   int rc = sheet.getLastRowNum();// to get the no of rows
	   System.out.println(rc);
		
	}

}
