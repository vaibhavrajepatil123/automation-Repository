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

public class ToWriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
      FileInputStream fis = new FileInputStream("./src/main/resources/WorldCup.xlsx");//read data from excel file
      Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
      Sheet sheet = wb.getSheet("hundreds");
     Row row = sheet.createRow(11);
     Cell cell = row.createCell(0);
     cell.setCellValue("Ashwin");
     
     // write the data in excel file
     FileOutputStream fos = new FileOutputStream("./src/main/resources/WorldCup.xlsx");
     wb.write(fos);
     
   
      
	}

}
