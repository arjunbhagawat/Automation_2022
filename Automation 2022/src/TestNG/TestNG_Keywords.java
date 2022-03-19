package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords {
	
	/*@Test(invocationCount = 5)
	public void TC1() {
		Reporter.log("Running TC1", true);
	}*/
	
	@Test(priority = -2)
	public void TC2() {
		Reporter.log("Running TC2", true);
	}
	
	@Test(priority = 1,invocationCount = 2)
	public void TC3() {
		Reporter.log("Running TC3", true);
	}
	@Test(priority = -2)
	public void TC4() {
		Assert.fail();
		Reporter.log("Running TC4", true);
	}
	
	@Test(enabled = false)
	public void TC5() {
		Reporter.log("Running TC5", true);
	}
	
	/*@Test(timeOut = 5000)
	public void TC6() throws InterruptedException {
		Thread.sleep(6000);
		Reporter.log("Running TC6", false);
	}*/
	
	@Test(dependsOnMethods = {"TC4","TC3"})
	public void TC7() {
		Reporter.log("Running TC7");
	}

}
