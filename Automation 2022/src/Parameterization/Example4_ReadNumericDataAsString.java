package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_ReadNumericDataAsString {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\ExcelSheets\\Excel1.xlsx"); 
		
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		System.out.println(data);
	}

}
