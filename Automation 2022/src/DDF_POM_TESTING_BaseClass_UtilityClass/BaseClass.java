package DDF_POM_TESTING_BaseClass_UtilityClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class BaseClass {
	
	static WebDriver driver;
	public static void browserOpen() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARIUN\\eclipse-workspace\\Automation 2022\\browsers\\chromedriver.exe");//key=name of browser, value=path of .exe file
		 driver=new ChromeDriver();//upcasting
		
		 ChromeOptions options = new ChromeOptions();//notifications
		 options.addArguments("--disable-notifications");
		 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//synchronization/wait
		
		driver.get(UtilityClass.getPropertyFileData("url"));
	}

}
