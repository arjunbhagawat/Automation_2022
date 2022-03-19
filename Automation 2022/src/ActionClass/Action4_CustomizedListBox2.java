package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action4_CustomizedListBox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		//step 1:
        WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
        //step 2:
		Actions act = new Actions(driver);
		
		//step3:
		act.click(month).perform();
		Thread.sleep(2000);
		
		for(int i=1;i<=12;i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		
		for(int i=1; i<=7; i++) {
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
}
