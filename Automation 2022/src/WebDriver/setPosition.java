package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver=new ChromeDriver();//upcasting
		
		
		//8. navigate- alternative to get method
		driver.navigate().to("https://www.facebook.com/");
		
		//9. setPosition
		Point p = new Point(400,200);
		driver.manage().window().setPosition(p);
		
		//10. setSize
		Dimension d = new Dimension(400,200);
		driver.manage().window().setSize(d);
		
	}

}
