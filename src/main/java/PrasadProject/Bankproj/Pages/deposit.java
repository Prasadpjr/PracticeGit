package PrasadProject.Bankproj.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import PrasadProject.Bankproj.Base.Base1;


public class deposit extends Base1
	{ 
	  @FindBy(linkText = "Deposit") WebElement deposit;
	  @FindBy(name = "accountno") WebElement accntno;
	  @FindBy(name = "ammount") WebElement amt;
	  @FindBy(name = "desc") WebElement desc;
	  @FindBy(name = "AccSubmit") WebElement sub;

  public void deposit_amt1() throws IOException 
  	{
	  deposit.click();
	  accntno.sendKeys(readexcelbase(0, 1, "deposit"));
	  amt.sendKeys(readexcelbase(1, 1, "deposit"));
	  desc.sendKeys(readexcelbase(2, 1, "deposit"));
	  sub.click();
	  writeexcelbase(3, 1, "deposited successfully", "deposit");
  	}
  public void deposit_amt2() throws IOException 
	{
	  deposit.click();
	  accntno.sendKeys(readexcelbase(0, 2, "deposit"));
	  amt.sendKeys(readexcelbase(1, 2, "deposit"));
	  desc.sendKeys(readexcelbase(2, 2, "deposit"));
	  sub.click();
	  writeexcelbase(3, 2, "deposited successfully", "deposit");
	}
  public void deposit_amt3() throws IOException 
	{
	  deposit.click();
	  accntno.sendKeys(readexcelbase(0, 3, "deposit"));
	  amt.sendKeys(readexcelbase(1, 3, "deposit"));
	  desc.sendKeys(readexcelbase(2, 3, "deposit"));
	  sub.click();
	  writeexcelbase(3, 3, "deposited successfully", "deposit");
	}
}
