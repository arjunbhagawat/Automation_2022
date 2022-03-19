package DDF_POM_TESTING_BaseClass_UtilityClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteLogOutPage {
	@FindBy(xpath="//a[contains(text(),'Logout')]") private WebElement logout;
	
	public KiteLogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickKitelogOutPageLogOutBtn() {
		logout.click();
	}
	

}
