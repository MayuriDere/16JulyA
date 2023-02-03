package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class1 {
	
	   
	//@Authorname: Suraj
	//this method is use to get data from excel sheet
	//need to pass 2 param 1.rowindex 2.cellindex
	public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
		
		//FileInputStream file=new FileInputStream("C:\\Users\\Suraj chavan\\eclipse-workspace\\16 July A Selenium\\TestData\\16 july 1st Excel sheet.xlsx");
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\16 july 1st Excel sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
	public static void capturescrshot(WebDriver driver,int TCID) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dest=new File("C:\\Users\\Suraj chavan\\eclipse-workspace\\16 July A Selenium\\FailedTcaseScrShot\\FirstTest"+TCID+".jpg");
		File dest=new File(System.getProperty("user.dir")+"\\FailedTcaseScrShot\\FirstTest\"+TCID"+".jpg");
		FileHandler.copy(src, dest);
	}
	
	
	public static String getPFdata(String key) throws IOException {
		
		//FileInputStream file=new FileInputStream("C:\\Users\\Suraj chavan\\eclipse-workspace\\16 July A Selenium\\Propfile1.properties");
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Propfile1.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}

}
