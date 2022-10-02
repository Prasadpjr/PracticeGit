package PrasadProject.Bankproj.Pages;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import PrasadProject.Bankproj.Base.Base1;




public class Newacnt extends Base1{
	public WebDriver driver;
	public void Newacnt(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(linkText = "New Account")
	WebElement accnt;
	@FindBy(name = "cusid")
	WebElement custid;
	@FindBy(name = "selaccount")
	WebElement acnt_type;
	@FindBy(name = "inideposit")
	WebElement depoist;
	@FindBy(name = "button2")
	WebElement sub;

  public void accunt1() throws IOException, InterruptedException
  	{
	  accnt.click();
	  custid.sendKeys(readexcelbase(0, 1, "newaccnt"));
	  acnt_type.sendKeys(readexcelbase(1, 1, "newaccnt"));
	  depoist.sendKeys(readexcelbase(2, 1, "newaccnt"));
	  sub.click();
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
//	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	  screenShotMethod("D:\\project_bank\\New Account1.png", driver);
	  writeexcelbase(4, 1, "Account created", "newaccnt");
  	}
  public void accunt2() throws IOException, InterruptedException
	{
	  accnt.click();
	  custid.sendKeys(readexcelbase(0, 2, "newaccnt"));
	  acnt_type.sendKeys(readexcelbase(1, 2, "newaccnt"));
	  depoist.sendKeys(readexcelbase(2, 2, "newaccnt"));
	  sub.click();
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
//	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	  screenShotMethod("D:\\project_bank\\New Account2.png", driver);
	  writeexcelbase(4, 2, "Account created", "newaccnt");
	}
  public void accunt3() throws IOException, InterruptedException
	{
	  accnt.click();
	  custid.sendKeys(readexcelbase(0, 3, "newaccnt"));
	  acnt_type.sendKeys(readexcelbase(1, 3, "newaccnt"));
	  depoist.sendKeys(readexcelbase(2, 3, "newaccnt"));
	  sub.click();
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
//	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	  screenShotMethod("D:\\project_bank\\New Account2.png", driver);
	  writeexcelbase(4, 3, "Account created", "newaccnt");
	}
}
