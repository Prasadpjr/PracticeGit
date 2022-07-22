package DDR_Frame.Test;

import java.util.HashMap;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import DDR_Frame.Base.BaseTest;
import DDR_Frame.Utilities.Excel_Reader;
import DDR_Frame.Utilities.FetchingData;

public class LoginTest extends BaseTest  {

		
		public Excel_Reader xls;
		
		@BeforeClass
		public void init(){
			
			initialise();
			
		}
		
		@DataProvider
		public Object[][] getData() throws Exception{
			
			String filePath = propObj.getProperty("xlsxFilePath");
			
			xls = new Excel_Reader(filePath);
	    
		    Object[][] testData = FetchingData.getTestData(xls,"LoginTest","Data");
			
		    return testData;
		}
		
		@Test(dataProvider="getData")
		public void doLoginTest(HashMap<String,String> map) throws InterruptedException {
			
			eTest = eReport.startTest("LoginTest");
			
			eTest.log(LogStatus.INFO, "Login test started");
			
			if(!FetchingData.isRunnable(xls,"LoginTest","Testcases") || map.get("Runmode").equals("N")){
				
				eTest.log(LogStatus.SKIP, "Skipping the test as the run mode is set to N");
				throw new SkipException("Skipping the test as the run mode is set to N");
				
			}	
			
			openBrowser(map.get("Browser"));
			
			navigate("appURL");
			
			boolean actualResult = doLogin(map.get("Username"),map.get("Password"));
				
		    boolean expectedResult = false;
		    
		    if(map.get("ExpectedResult").equals("Success")) {
		    	
		    	expectedResult = true;
		    	
		    }else {
		    	
		    	expectedResult = false;
		    	
		    }
				
			
			if(actualResult!=expectedResult) {
				
				reportFail("Login test failed");
				
			}else {
				
				reportPass("Login test passed");
				
			}
			
		}
		
		@AfterMethod
		public void testClosure() {
			
			eReport.endTest(eTest);
			
			eReport.flush();
			
			if(driver!=null) {
			driver.quit();
			}
		}
}

