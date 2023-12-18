package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Toreaddatafromexcel{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Files/Practice.xlsx");
		Workbook wb=WorkbookFactory.create(fis);//helper class used to create respective file object
		String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);
	}
}
