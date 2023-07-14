package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass 
{
@Test
void test_Account_Reg() throws InterruptedException 
{
	logger.debug("Application Logs..");
	logger.info("*** Started TC_001_AccountRegistrationTest ***");
	Homepage hp = new Homepage(driver);
	hp.clickMyaccount();
	logger.info("Clicked on Myaccount");
	hp.clickRegister();
	logger.info("Clicked on Register");
	AccountRegistrationPage ar = new AccountRegistrationPage(driver);
	logger.info("Provided the Customer Data");
	ar.setfirstname(randomString().toUpperCase());
	ar.setlastname(randomString().toUpperCase());
	ar.setemail(randomString()+"@gmail.com");
	ar.setpassword(randomalphanumeric());
	ar.setprivacypolicy();
	ar.clickcontinue();
	logger.info("Clicked on Continue");
	logger.info("*** Finished TC_001_AccountRegistrationTest ***");
	/*String cnfrm = ar.getConfirmation();
	Assert.assertEquals(cnfrm,"Your Account Has Been Created!");
	catch(Exception e)
	{
		Assert.fail();
	}*/
}
}
