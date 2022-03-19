package POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		Thread.sleep(2000);
		
		GitHub_SignIn signIn = new GitHub_SignIn(driver);
		signIn.clickGitHubSignInBtn();
		
		GitHub_Login login = new GitHub_Login(driver);
		login.setGitHubLoginUsername();
		login.setGitHubLoginPassword();
		login.clickGitHubLoginBtn();
		
		GitHub_HomePage home = new GitHub_HomePage(driver);
		home.clickGitHubHomePageClickBtn();
		Thread.sleep(2000);
		home.clickGitHubHomePageSignOutBtn();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
