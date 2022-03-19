package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting_CT {
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException {
		WebDriver driver = null;
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\iediagcmd.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
