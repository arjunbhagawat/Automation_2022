package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_getRowSize {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\ExcelSheets\\Excel1.xlsx"); 
		
		int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(rowsize+1);//1
		
		//getLastRowNum -returns number of rows from 0th index
	}

}
