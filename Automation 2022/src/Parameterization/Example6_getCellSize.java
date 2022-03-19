package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_getCellSize {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\ExcelSheets\\Excel1.xlsx"); 
		
		short cellSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(cellSize);//4
		
		//getLastCellNum - it returns number 0 elements/values present in cell/column
	}

}
