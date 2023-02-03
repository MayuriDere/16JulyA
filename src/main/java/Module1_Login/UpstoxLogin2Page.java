package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2Page {
	
	@FindBy(xpath="//input[@id='yob']") private WebElement yearofBirth;
	
	 public UpstoxLogin2Page(WebDriver driver){
		 
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void inpUpstoxLogin2PageYOB(String YOB) {
		
		 yearofBirth.sendKeys(YOB);
	}

}
