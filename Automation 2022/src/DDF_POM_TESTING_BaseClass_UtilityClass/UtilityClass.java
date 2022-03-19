package DDF_POM_TESTING_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static String getPropertyFileData(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream objFile = new FileInputStream(System.getProperty("user.dir")+"\\credentials.properties");
		obj.load(objFile);
		String value = obj.getProperty(key);
		return value;//https://kite.zerodha.com/
	}
	
	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ARIUN\\eclipse-workspace\\Automation 2022\\TestData\\KITE_Credentials.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("KITE_ZERODHA");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
		
	}
	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ARIUN\\eclipse-workspace\\Automation 2022\\screenshots\\screenshot_"+TCID+".png");
		FileHandler.copy(src, dest);
	}
}
