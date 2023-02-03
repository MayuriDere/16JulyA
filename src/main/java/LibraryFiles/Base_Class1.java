package LibraryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class1 {
	
	public WebDriver driver;
	
	public void initializeBrowser() throws IOException {
		
		driver=new ChromeDriver();
		driver.get(Utility_Class1.getPFdata("URL"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	

}
