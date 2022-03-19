package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Test_Class {
	
	@Test
	public void test1() {
		//System.out.println("Good Night");
		Reporter.log("Good Night", false);
		//false -> message won't be displayed at console but it will be displayed in emailable report
		//true -> message will be displayed in console as well as in emailable report
	}
	
	@Test
	public void test2() {
		Reporter.log("good morning", false);
	}
}
