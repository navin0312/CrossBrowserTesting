package generics;

import java.util.concurrent.TimeUnit;

import javax.swing.SpringLayout.Constraints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ISuiteResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class  BaseTest implements AutoConstant
{ 
   public WebDriver driver;
   @Parameters("browser")
   
   @BeforeClass
   public void openBrowser(String browser)
   {
	 if(browser.equalsIgnoreCase("firefox"))
	 {
		 driver=new FirefoxDriver();
	 }
	 else if(browser.equalsIgnoreCase("chrome"))
	 {
		 System.setProperty(chrome_key, chrome_value);
		 driver=new ChromeDriver();
	 }
	 else
	 {
		 System.setProperty(ie_key, ie_value);
		 driver=new InternetExplorerDriver();
	 }
	
   }
   @BeforeMethod
	 public void openApp()
	 {
		driver.get(url);
		driver.manage().window().maximize();
	 }
   
}
/*public class  BaseTest implements AutoConstant
 {
 public WebDriver driver; 
 @Parameters("browser")
 @BeforeClass
 public void openBrowser()
 {
  System.setProperty(chrome_key,chrome_value);
  driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
  driver.manage().window().maximize();
  driver.get(url);
 }
 @AfterClass
 public void closeBrowser()
 {
	// driver.quit();
 }
*/

