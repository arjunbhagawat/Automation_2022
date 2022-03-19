package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example9_VerifyTypeOfCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\ExcelSheets\\Excel1.xlsx");
		
		CellType cellType = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
		System.out.println(cellType);//STRING//NUMERIC//BOOLEAN
	}
}
