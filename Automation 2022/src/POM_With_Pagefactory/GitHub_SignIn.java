package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement SI;//declaration
	//@FindBy -> findElement
	
	public GitHub_SignIn(WebDriver driver) {//initialization
		PageFactory.initElements(driver, this);
	}
	
	public void clickGitHubSignInBtn() {//usage
		SI.click();
	}

}
