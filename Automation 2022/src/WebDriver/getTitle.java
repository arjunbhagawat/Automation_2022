package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
	
	public static void main(String[] args) {
		String expTitle = "Facebook – log in or sign up";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\Desktop\\SOFTWARE TESTING\\New folder\\chromedriver.exe");//key=name of browser, value=path of .exe file
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/");
		
		//4. getTitle
		String actTitle = driver.getTitle();
		System.out.println(actTitle);//Facebook – log in or sign up
		
		if(actTitle.equals(actTitle)) {
			System.out.println("pass");	
		}else {
			System.out.println("fail");
		}
		
	}

}

