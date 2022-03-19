package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2_getSizeOfList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select s = new Select(year);
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());//118
		
		//for(WebElement option:options) {
			//System.out.println(option.getText());
		//}
		
	for(int i=0; i<=options.size()-1; i++) {
		System.out.println(options.get(i).getText());
	}
	}
}
