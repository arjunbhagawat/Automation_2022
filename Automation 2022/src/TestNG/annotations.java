package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations {
	
	@BeforeClass
	public void openBrowser() {
		
	}
	
	@BeforeMethod
	public void login() {
		
	}
	
	@Test
	public void verifyUsername1() {
		
	}
	
	@Test
	public void verifyUsername2() {
		
	}
	
	@Test
	public void verifyUsername3() {
		
	}
	
	@AfterMethod
	public void logOut() {
		
	}
	
	@AfterClass
	public void closeBrowser() {
		
	}

}
