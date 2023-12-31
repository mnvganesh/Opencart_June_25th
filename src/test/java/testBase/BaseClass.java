package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{ 
  public Logger logger;
  public WebDriver driver;
  @BeforeClass
  public void setup()
  {
	  logger = LogManager.getLogger(this.getClass());
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.opencart.com/");
	  driver.manage().window().maximize();
  }
  @AfterClass
  public void teardown()
  {
	  driver.quit();
  }
  public String randomString()
  {
	  String generatedString = RandomStringUtils.randomAlphabetic(5);
	  return(generatedString);
  }
  public String randomnumber()
  {
	  String generatedString1 = RandomStringUtils.randomNumeric(10);
	  return(generatedString1);
  }
  public String randomalphanumeric()
  {
	  String str = RandomStringUtils.randomAlphabetic(4);
	  String num = RandomStringUtils.randomNumeric(3);
	  return(str+"@"+num); 
  }
}
