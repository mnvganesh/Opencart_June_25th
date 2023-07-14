package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends Basepage
{
   public AccountRegistrationPage(WebDriver driver)
   {
   super(driver);
   }
   
   @FindBy(name="firstname")
   WebElement txtfrstname;
   
   @FindBy(name="lastname")
   WebElement txtlstname;
   
   @FindBy(name="email")
   WebElement txtemail;
   
   @FindBy(name="password")
   WebElement txtpsword;
   
   @FindBy(xpath="//input[@name='agree']")
   WebElement checkpolicy;
   
   @FindBy(xpath="//button[normalize-space()='Continue']")
   WebElement btnconti;
   
   @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
   WebElement msgconfirmation;
   
  public void setfirstname(String fname)
  {
	  txtfrstname.sendKeys(fname);
  }
  public void setlastname(String lname)
  {
	  txtlstname.sendKeys(lname);
  }
  public void setemail(String email)
  {
	  txtemail.sendKeys(email);
  }
  public void setpassword(String pwd)
  {
	  txtpsword.sendKeys(pwd);
  }
  public void setprivacypolicy() throws InterruptedException
  {
	  Thread.sleep(5000);
	  checkpolicy.click();
  }
  public void clickcontinue() throws InterruptedException
  {
	  Thread.sleep(5000);
	  btnconti.click();
  }
  public String getConfirmation()
  {
	  try 
	  {
		  return (msgconfirmation.getText());  
	  }
	  catch(Exception e)
	  {
		  return (e.getMessage());
	  }
  }

}

