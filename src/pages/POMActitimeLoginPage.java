package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeLoginPage//inside pom classes we declare all the webElement  
{
 @FindBy(id="username")
 private WebElement usernameTextField;
 @FindBy(xpath="//input[@type='password']")
 private WebElement passwordTextField;
 @FindBy(id="keepLoggedInLabel")
 private WebElement keepmeloggedinCheckBox;
 @FindBy(xpath="//div[text()='Login ']")
 private WebElement loginButton;
 @FindBy(id="toPasswordRecoveryPageLink")
 private WebElement forgotyourpasswordLink;
 @FindBy(xpath="//a[text()='actiTIME Inc.'] ")
 private WebElement actitimeIncLink;
 // declaration of login page has been done
 public POMActitimeLoginPage(WebDriver driver)//inside the constructor we initiallize  the webElement
   {
	 PageFactory.initElements(driver, this);
   }//initialization has been done
 
 public void loginMethod()//inside the non static method we will perform the operation
  {
	usernameTextField.sendKeys("admin");
	passwordTextField.sendKeys("manager");
	keepmeloggedinCheckBox.click();
	loginButton.click();
 }
 /*public void forgotPasswordMethod()//if it id required then use it otherwise do not use it 
 {
  passwordTextField.click();	 
 }
 public void actitimeIncMethod()//if it id required then use it otherwise do not use it 
 {
	 actitimeIncLink.click();
 }
*/}
