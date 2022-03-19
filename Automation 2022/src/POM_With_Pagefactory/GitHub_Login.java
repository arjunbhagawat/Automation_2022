package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Login {
	
@FindBy(xpath="//input[@id='login_field']") private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	
	@FindBy(xpath="//input[@class='btn btn-primary btn-block js-sign-in-button']") private WebElement LoginBtn;
	
	public GitHub_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public  void setGitHubLoginUsername() {
		UN.sendKeys("bhagawatarjun23@gmail.com");
	}
	
	public void setGitHubLoginPassword() {
		PWD.sendKeys("bhagawat@1996");
	}
	
	public void clickGitHubLoginBtn() {
		LoginBtn.click();
	}

}
