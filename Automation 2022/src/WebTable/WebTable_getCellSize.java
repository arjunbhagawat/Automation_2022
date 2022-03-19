package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_getCellSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ARIUN/Desktop/SOFTWARE%20TESTING/HTML/webtable.html");
		Thread.sleep(2000);
		
		int cellSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[1]/th")).size();
		System.out.println(cellSize);//3
	}

}
