package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGVerification_SoftAssert {
	
	@Test
	public void test() {
		String actResult = "good night";
		String expResult = "good morning";
		boolean result = false;
		
		SoftAssert soft = new SoftAssert();
		//Verification 1
		soft.assertNotEquals(actResult, expResult,"act and exp result is same");
		
		//Verification 2
		soft.assertEquals(actResult, expResult,"act and exp result is different");
		
		//Verification 3
		soft.assertTrue(result, "result is false");
		
		soft.assertAll();
		
		//output: act and exp result is different expected [good morning] but found [good night],
		//result is false expected [true] but found [false]
	}

}
