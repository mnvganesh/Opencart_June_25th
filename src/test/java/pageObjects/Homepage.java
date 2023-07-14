package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage 
{
      public Homepage(WebDriver driver)
      {
      super(driver);
      }
      
      @FindBy(xpath = "//span[text()='My Account']")
      WebElement txt_Myacc_link;
      @FindBy(xpath ="//a[text()='Register']")
      WebElement txt_Reg_link;
      
      public void clickMyaccount()
      {
    	  txt_Myacc_link.click();
      }
      public void clickRegister()
      {
    	  txt_Reg_link.click();
      }
}
      
