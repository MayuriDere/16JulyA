package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHome_Page2{
	
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement PN;
	
	public UpstoxHome_Page2(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String getUpstoxHomePageActPN() 
	{
		String text = PN.getText();
		return text;
	}
	
//  public void verifyUpstoxHomePageUserID(String expPN) {
//		
//		String actPN = PN.getText();
//		
//		if(actPN.contains(expPN)) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
//	}
		

}

