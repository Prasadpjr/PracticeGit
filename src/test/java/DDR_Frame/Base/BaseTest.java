package DDR_Frame.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import DDR_Frame.Utilities.ExtentReport;

public class BaseTest {
	
	

	public Properties propObj = null;	
	  public WebDriver driver = null;
	  public ExtentReports eReport = ExtentReport.getInstance();
	  public ExtentTest eTest;
	 

	  //Initialization of method to fetch property file
	  public void initialise(){		  
		  if(propObj==null){				
			  propObj = new Properties();				
				File projectConfigFile = new File("src\\test\\Proj_Resources\\TestingInput.properties");				
				FileInputStream fileobj = null;				
				try {					
					fileobj = new FileInputStream(projectConfigFile);
					propObj.load(fileobj);					
				} catch (Exception e) {			
					e.printStackTrace();		
				}				
			}	  
	  }
	  
	  //Open Browser method with code to open browser
	  public void openBrowser(String browserType){	
		 
		  eTest.log(LogStatus.INFO, "Opening Browser : "+browserType);		  
		  if(browserType.equalsIgnoreCase("firefox")) { 
			  System.setProperty("webdriver.gecko.driver",propObj.getProperty("FirefoxDriverPath"));
			 driver = new FirefoxDriver();		  		   
		  }else if(browserType.equalsIgnoreCase("chrome")) {		  
			  System.setProperty("webdriver.chrome.driver", propObj.getProperty("chromeDriverPath"));			  
			  driver = new ChromeDriver();  
		  }else if(browserType.equalsIgnoreCase("ie")) {			  
			  System.setProperty("webdriver.ie.driver", propObj.getProperty("ieDriverPath"));			  
			  driver = new InternetExplorerDriver();
		  }		  
		  eTest.log(LogStatus.INFO, "Browser opened Successfully "+browserType);		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	  }
	  
	  //Open application said URL in properties file
	  public void navigate(String appURL) {
		  
		  driver.get(propObj.getProperty(appURL));
		  eTest.log(LogStatus.INFO, "Navigated to "+propObj.getProperty(appURL));
	  }
	  
	  //Login into Application
	  public boolean doLogin(String Username,String Password) throws InterruptedException {
		  click("LoginLink_classname");
		  type("LoginUsername_xpath",Username);
		  Thread.sleep(5000);
		  click("Nextbtn");
		  type("LoginPassword",Password);
		  click("Signin");
		  if(isElementPresent("Signin")) {
			  
			  return true;
		  
		  }else {
			  
			  return false;
		 
		  }
		  
	  }
	  
	  //Clicking UI element
	  public void click(String locatorKey) {
		  	
		 eTest.log(LogStatus.INFO, "Clicking on "+locatorKey);
		 WebElement element =  getElement(locatorKey);
		 element.click();
		 eTest.log(LogStatus.INFO, "Successfully clicked on "+locatorKey);
		 
	  }
	  
	  //Intakes locator key and return WebElement based on the locator type
	  public WebElement getElement(String locatorKey) {
		  
		  WebElement element = null;
		  
		  try {
			  
		  
			  if(locatorKey.endsWith("_id")) {
				  
				  element = driver.findElement(By.id(propObj.getProperty(locatorKey)));
				  
			  }else if(locatorKey.endsWith("_name")) {
				  
				  element = driver.findElement(By.name(propObj.getProperty(locatorKey)));
				  
			  }else if(locatorKey.endsWith("_classname")) {
				  
				  element = driver.findElement(By.className(propObj.getProperty(locatorKey)));
				  
			  }else if(locatorKey.endsWith("_cssselector")) {
				  
				  element = driver.findElement(By.cssSelector(propObj.getProperty(locatorKey)));
				  
			  }else if(locatorKey.endsWith("_xpath")) {
				  
				  element = driver.findElement(By.xpath(propObj.getProperty(locatorKey)));
				  
			  }else {
				  
				  reportFail("The provided Locator - "+locatorKey+" is not found");
				  
			  }
			  
		  }catch(Exception e) {
			  
			  reportFail(e.getMessage());
			  
		  }
		  
		  return element;
		  
	  }
	  
	  //Types text into text box fields
	  public void type(String locatorKey,String data) {
		  
		 eTest.log(LogStatus.INFO, "Typing text into "+locatorKey+" with data "+data);
		 WebElement element = getElement(locatorKey);
		 element.sendKeys(data);
		 eTest.log(LogStatus.INFO, "Successfully typed text into "+locatorKey+" with data "+data);
			  
	  }
	  
	  //Finding whether the required element is available on the page
	  public boolean isElementPresent(String locatorKey) {
		  
		  WebElement element = getElement(locatorKey);
		  
		  boolean presentStatus = element.isDisplayed();
		  
		  return presentStatus;
		  
	  }
	  
	  //This method will be called when the test is passed
	  public void reportPass(String messsage) {
		  
		  eTest.log(LogStatus.PASS, messsage);
		  
	  }
	  
	  //This method will be called when the test is failed
	  public void reportFail(String message) {
		  
		  takeScreenshot();
		  eTest.log(LogStatus.FAIL, message);
		  Assert.fail(message);
		  
	  }
	  
	  //Will be called to take screenshots
	  public void takeScreenshot(){
			
			Date d=new Date();
			String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("screenshots//"+screenshotFile));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//put screenshot file in reports
			eTest.log(LogStatus.INFO,"Screenshot-> "+ eTest.addScreenCapture(System.getProperty("user.dir")+"//screenshots//"+screenshotFile));
			
		}

}
