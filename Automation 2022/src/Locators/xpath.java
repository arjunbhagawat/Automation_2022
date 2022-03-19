package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qa@pune.com");
	
	driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("QA@123");
	
	driver.findElement(By.xpath("button[text()='Log In']")).click();
	
	Thread.sleep(2000);
	driver.close();
}

}
