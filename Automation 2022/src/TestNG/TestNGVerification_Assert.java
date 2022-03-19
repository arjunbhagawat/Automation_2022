package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGVerification_Assert {

	// 1. assertEquals
	/*
	  @Test public void test() { Reporter.log("running test method", true); String
	  expResult = "good night"; String actResult = "good night";
	  
	  Assert.assertEquals(actResult,
	  expResult,"act and exp results are different"); }
	 */

	// 2. assertNotEquals
	/*
	  @Test public void test() { Reporter.log("running test method", true); String
	  expResult = "good night"; String actResult = "good morning";
	  
	  Assert.assertNotEquals(actResult, expResult,"act and exp results are same");
	  }
	 */

	// 3. assert true
	/*
	  @Test public void test() { Reporter.log("running test method", true); boolean
	  result = true;
	  
	  Assert.assertTrue(result, "result is false"); }
	 */

	// 4. assertFalse
	/*
	  @Test public void test() { Reporter.log("running test method", true); boolean
	  result = false;
	  
	  Assert.assertFalse(result, "result is true"); }
	 */

	// 5. assertNull
	/*
	  @Test public void test() { Reporter.log("running test method", true); String
	  actResult = null;
	 
	  Assert.assertNull(actResult, "act result is not null"); }
	 */

	//6. assertNotNull
	@Test
	public void test() {
		Reporter.log("running test method", true);
		String actResult = "Quantum";

		Assert.assertNotNull(actResult, "act result is null");
	}
	
	//7.fail
	@Test
	public void test1() {
		Reporter.log("running test method", true);
		
		Assert.fail();

	}
}
