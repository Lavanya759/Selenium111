package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class readingfromexcel {

public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./Files/Practice.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String email=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(email);
}
}
