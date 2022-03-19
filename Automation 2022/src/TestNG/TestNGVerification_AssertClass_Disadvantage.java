package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGVerification_AssertClass_Disadvantage {
	
	//HardAssert
	@Test
	public void test() {
		String actResult = "good night";
		String expResult = "good morning";
		boolean result = false;
		
		//verification 1
		Assert.assertEquals(actResult, expResult,"act and exp results are different");
		
		//verification 2
		Assert.assertNotEquals(actResult, expResult,"Verification 1:act and exp results are same");
		
		//verification 3
		Assert.assertTrue(result, "result is false");
		
		//output: java.lang.AssertionError: act and exp results are different expected [good morning] but found [good night]

	}

}
