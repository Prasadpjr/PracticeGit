package PrasadProject.Bankproj.Base;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PrasadProject.Bankproj.Pages.login;
import PrasadProject.Bankproj.Pages.Change_pass;
import PrasadProject.Bankproj.Pages.Customised_Statement;
import PrasadProject.Bankproj.Pages.Fund_transf;
import PrasadProject.Bankproj.Pages.New_customer;
import PrasadProject.Bankproj.Pages.Newacnt;
import PrasadProject.Bankproj.Pages.Withdrawal;
import PrasadProject.Bankproj.Pages.balance_enq;
import PrasadProject.Bankproj.Pages.delete_accnt;
import PrasadProject.Bankproj.Pages.delete_cust;
import PrasadProject.Bankproj.Pages.deposit;
import PrasadProject.Bankproj.Pages.edit_account;
import PrasadProject.Bankproj.Pages.edit_cust;
import PrasadProject.Bankproj.Pages.logout;
import PrasadProject.Bankproj.Pages.mini_statement;



public class Final extends Base1{
	Logger log1 = Logger.getLogger(Final.class);
//_____________________________________________________________________________________________________	
@Test (priority = 1)
public void login() throws IOException 
	{
	
	   login Lg=PageFactory.initElements(driver, login.class);
	   Lg.Login();
	   log1.debug("login page values passed");

	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority =2 )
public void Newcustomer() throws IOException, Throwable
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	 	New_customer lg2=PageFactory.initElements(driver, New_customer.class); 
	 	log1.debug("New Customer pages values filling ");
		 lg2.newcust1_click();

//		 Alert a =driver.switchTo().alert();
//		 a.accept();
		 
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\user1.png", driver);
		 Thread.sleep(5000);
		  log1.debug("New Customer Click1 passed");
		 lg2.newcust2_click();
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\user2.png", driver);
		 log1.debug("New Customer Click2 passed");
		 Thread.sleep(5000);
		 lg2.newcust3_click();
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\user3.png", driver);
		 log1.debug("New Customer Click3 passed");
		 Thread.sleep(5000);
		 lg2.newcust4_click();
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\user4.png", driver);
		 log1.debug("New Customer Click4 passed");
		 Thread.sleep(5000);
		 lg2.newcust5_click();
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\user5.png", driver);
		 log1.debug("New Customer Click5 passed");
		 Thread.sleep(5000);
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority = 3)
public void EditCustomer() throws IOException
	{
		edit_cust edt=PageFactory.initElements(driver, edit_cust.class); 
		edt.editcust();
		log1.debug("EditCustomer values passed");
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority =4 )
public void DeleteCustomer() throws IOException
	{
		delete_cust del=PageFactory.initElements(driver, delete_cust.class); 
		del.delete();
		driver.switchTo().alert().accept();
		String a=driver.switchTo().alert().getText();
		log1.debug("DeleteCustomer 1st popup message : "+a);
		driver.switchTo().alert().accept();
		String b=driver.switchTo().alert().getText();
		log1.debug("DeleteCustomer 2st popup message : "+b);
		del.sub();
		log1.debug("DeleteCustomer values passed");

	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority = 5 )
public void NewAccount() throws IOException, InterruptedException
	{
		log1.debug("NewAccount values fill started");
		Newacnt newac=PageFactory.initElements(driver, Newacnt.class); 
		newac.accunt1();
		screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\New Account1.png", driver);
		Thread.sleep(5000);
		log1.debug("NewAccount 1st account created");
		newac.accunt2();
		screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\New Account2.png", driver);
		Thread.sleep(5000);
		log1.debug("NewAccount 2nd account created");
		newac.accunt3();
		screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\New Account3.png", driver);
		log1.debug("NewAccount 3rd account created");
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority = 6)
public void EditAccount() throws IOException
	{
		edit_account edtac=PageFactory.initElements(driver, edit_account.class); 
		edtac.editacnt();
		log1.debug("EditAccount completed");
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority = 7)
public void DeleteAccount() throws IOException
	{
		delete_accnt del_ac=PageFactory.initElements(driver, delete_accnt.class); 
		del_ac.deleteacc();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		log1.debug("DeleteAccount completed");
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority = 8)
public void Deposit() throws IOException, Throwable
	{
		log1.debug("Deposit values started");
		deposit dep=PageFactory.initElements(driver, deposit.class); 
		dep.deposit_amt1();screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\deposited1.png", driver);
		dep.deposit_amt2();screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\deposited2.png", driver);
		dep.deposit_amt3();screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\deposited3.png", driver);
		log1.debug("Deposit values completed");
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority = 9)
public void withdrawal() throws IOException
	{
		Withdrawal with=PageFactory.initElements(driver, Withdrawal.class);
		with.wihdrw_amt1();screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\withdrawal1.png", driver);
		with.wihdrw_amt2();screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\withdrawal2.png", driver);
		with.wihdrw_amt3();screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\withdrawal3.png", driver);
		log1.debug("withdrawal values completed");
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority =10 )
public void FundTransfer() throws IOException
	{
		Fund_transf fndt=PageFactory.initElements(driver, Fund_transf.class);
		fndt.fundtransfr1();screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\transfer1.png", driver);
		fndt.fundtransfr2();screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\transfer2.png", driver);
		log1.debug("FundTransfer values completed");
	}
//_____________________________________________________________________________________________________	
@Test(enabled = false)
//@Test (priority =11 )
public void ChangePassword() throws IOException
	{
		Change_pass pass=PageFactory.initElements(driver, Change_pass.class);
		pass.change();
		log1.debug("ChangePassword values completed");
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority = 11)
public void BalanceEnquiry() throws IOException
	{
	
		balance_enq bal=PageFactory.initElements(driver, balance_enq.class);
		bal.balance();
		log1.debug("BalanceEnquiry values completed");
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority = 12)
public void MiniStatement() throws IOException
	{
		mini_statement min=PageFactory.initElements(driver, mini_statement.class);
		min.mini_state();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\MiniStatement.png", driver);
		log1.debug("MiniStatement values completed");
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority =13 )
public void CustomisedStatement() throws IOException
	{
		Customised_Statement cust=PageFactory.initElements(driver, Customised_Statement.class);
		cust.custmsd();screenShotMethod("C:\\Prasad\\selenium\\Screenshots\\Customised.png", driver);
		log1.debug("CustomisedStatement values completed");
	}
//_____________________________________________________________________________________________________	
//@Test(enabled = false)
@Test (priority =14 )
public void Log_out() throws IOException, InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		logout lgt=PageFactory.initElements(driver, logout.class);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		lgt.log_out();
		
		log1.debug("Logout clicked");
		 Alert a =driver.switchTo().alert();
		 String b=driver.switchTo().alert().getText();
		 a.accept();
		 log1.debug("logout message : "+b);
	}
//_____________________________________________________________________________________________________	

}
