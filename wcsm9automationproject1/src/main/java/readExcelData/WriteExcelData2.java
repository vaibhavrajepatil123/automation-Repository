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

public class WriteExcelData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
       FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
       Workbook wb = WorkbookFactory.create(fis);
      Sheet sheet = wb.getSheet("IPL");
      
      // create the cell location
      Row row = sheet.getRow(0);
      Cell cell = row.createCell(2);
      cell.setCellValue("LOCATION");
      // to write the data 
      FileOutputStream fos = new FileOutputStream("./src/main/resources/TestData.xlsx");
		wb.write(fos);

	
	
	}

}
