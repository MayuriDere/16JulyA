package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1Page {
	
	@FindBy(xpath="//input[@id='userCode']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement loginbtn;
	
	public UpstoxLogin1Page(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void inpUpstoxLogin1PageUsername(String username) {
		
		UN.sendKeys(username);
	}
	
	public void inpUpstoxLogin1PagePassword(String password) {
		
		PWD.sendKeys(password);
	}
	
	public void clkUpstoxLogin1PageLginbtn() {
		
		loginbtn.click();
	}

}
