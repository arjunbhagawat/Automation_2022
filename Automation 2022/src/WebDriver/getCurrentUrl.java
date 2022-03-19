package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {
	
	public static void main(String[] args) {
		String expUrl ="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver=new ChromeDriver();//upcasting
		
		//6.maximize
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//5.getCurrentUrl
		String actUrl = driver.getCurrentUrl();
		
		if(actUrl.equals(expUrl)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		//7.minimize
		driver.manage().window().minimize();
	}

}
