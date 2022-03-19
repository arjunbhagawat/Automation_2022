package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example8_PrintCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\ExcelSheets\\Excel1.xlsx"); 
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		for(int i=0; i<=sh.getLastRowNum(); i++) {
		String data =sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(data);
	}
  }
}
