package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver=new ChromeDriver();//upcasting
		
		//1. get- to open url
		//driver.get("https://www.facebook.com/");
		
		//driver.get("faceook"); //IvalidArgumentExeption
		
		driver.get("https:amazon.orgs/");//WebDriverException-> when url is not well formed
		
		//2. close- close browser(single tab)
		//driver.close();
		
		//3. quit- close browser
		driver.quit();
	}
	
}
