package DDF_POM_TESTING_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest extends BaseClass {
	
	KiteLoginPage1 login1;
	KiteLoginPage2 login2;
	KiteHomePage home;
	KiteLogOutPage logout;
	@BeforeClass
	public void openBrowser() throws IOException {
		browserOpen();
		login1 = new KiteLoginPage1(driver);
		login2 = new KiteLoginPage2(driver);
		home = new KiteHomePage(driver);
		logout = new KiteLogOutPage(driver);
	}
	
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException {
		login1.setKiteloginPage1Username(UtilityClass.getTestData(0, 0));
		login1.setKiteloginPage1Password(UtilityClass.getTestData(0, 1));
		login1.clickKiteLoginPage1LoginBtn();
		
		login2.setKiteLoginPage2Pin(UtilityClass.getTestData(0, 2));
		login2.clickKiteLoginPage2ContinueBtn();
	}
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		String expResult = UtilityClass.getTestData(0, 3);
		String actResult = home.verifyKiteHomePageProfileName();
		
		Assert.assertEquals(actResult, expResult,"act & exp results are different");
	}
	
	@AfterMethod
	public void logOutKite(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			int TCID =200;
			UtilityClass.captureScreenshot(driver, TCID);
		}
		home.clickKiteHomePagePN();
		logout.clickKitelogOutPageLogOutBtn();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
