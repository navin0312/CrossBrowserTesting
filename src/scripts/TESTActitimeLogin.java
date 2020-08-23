package scripts;//specially for execution because  it has main method 

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.BaseTest;
import pages.POMActitimeLoginPage;

public class TESTActitimeLogin extends BaseTest
{
	@Test
	public void login()
	{
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
	}
}
/*public class TESTActitimeLogin 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		//now i need to perform the main operation
		 POMActitimeLoginPage login=new  POMActitimeLoginPage(driver);
		 login.loginMethod();
		

	}

}
*/