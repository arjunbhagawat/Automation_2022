package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/ARIUN/Desktop/SOFTWARE%20TESTING/HTML/LoginForm.html");
		
		//1. tagName
		driver.findElement(By.tagName("input")).sendKeys("qa@pune.com");
		
		//2.name
		driver.findElement(By.name("12345")).sendKeys("p@ssword");
		
		//3.classname
		driver.findElement(By.className("abc")).sendKeys("qa@pune.com");
		
		//4. id
		driver.findElement(By.id("789")).sendKeys("789456123");
		
		//5.linkText
		//driver.findElement(By.linkText("Link1")).click();
		
		//6.partialLinkText
		driver.findElement(By.partialLinkText("Lin")).click();
		
		driver.close();
		
	}

}
