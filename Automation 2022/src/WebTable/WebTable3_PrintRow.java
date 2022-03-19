package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3_PrintRow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ARIUN/Desktop/SOFTWARE%20TESTING/HTML/webtable.html");
		Thread.sleep(2000);
		
		List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[2]/td"));
		
		for (WebElement row : firstRow) {
			System.out.println(row.getText());
		}
	}

}
