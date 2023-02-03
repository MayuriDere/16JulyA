package Module1_Login_Test;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.Base_Class1;
import LibraryFiles.Utility_Class1;
import Module1_Login.UpstoxHome_Page2;
import Module1_Login.UpstoxLogin1Page;
import Module1_Login.UpstoxLogin2Page;

public class UpstoxLoginTest2 extends Base_Class1 {
	
	UpstoxLogin1Page login1;
	UpstoxLogin2Page login2;
	UpstoxHome_Page2 home;
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		
		initializeBrowser();
		
	    login1=new UpstoxLogin1Page(driver);
		login2=new UpstoxLogin2Page(driver);
		home=new UpstoxHome_Page2(driver);
	}
	
	
	
	@BeforeMethod
	public void logintoApp() throws EncryptedDocumentException, IOException {
		login1.inpUpstoxLogin1PageUsername(Utility_Class1.getPFdata("UN"));
		login1.inpUpstoxLogin1PagePassword(Utility_Class1.getPFdata("PWD"));
		login1.clkUpstoxLogin1PageLginbtn();
		login2.inpUpstoxLogin2PageYOB(Utility_Class1.getPFdata("YOB"));
	}
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException {
	    TCID=01;
		String actPN = home.getUpstoxHomePageActPN();
		String expPN = Utility_Class1.getTD(0, 3);
		
		Assert.assertEquals(actPN, expPN,"Failed: Both results are different");
		
	//home.verifyUpstoxHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
		
	}
	@AfterMethod
	public void logoutFromApp(ITestResult s1) throws IOException {
		if(s1.getStatus()==ITestResult.FAILURE) {
			Utility_Class1.capturescrshot(driver, TCID);
		}
	}
	@AfterClass
	public void closeBrowser() {
		
		//driver.close();
	}

}
