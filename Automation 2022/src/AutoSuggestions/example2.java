package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {
	public static void main(String[] args) throws InterruptedException {
		String exp = "oneplus nord";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");
		
		Thread.sleep(2000);
        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
        
        for (WebElement option : allOptions) {
		String act = option.getText();
		
		if(act.equals(exp));{
			option.click();
			break;
		}
	}
        Thread.sleep(2000);
        driver.close();
	}

}
