package PrasadProject.Bankproj.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import PrasadProject.Bankproj.Base.Base1;



public class Withdrawal extends Base1
{ 
		  @FindBy(linkText = "Withdrawal") WebElement withdr;
		  @FindBy(name = "accountno") WebElement accntno;
		  @FindBy(name = "ammount") WebElement amt;
		  @FindBy(name = "desc") WebElement desc;
		  @FindBy(name = "AccSubmit") WebElement sub;

	  public void wihdrw_amt1() throws IOException 
	  	{
		  withdr.click();
		  accntno.sendKeys(readexcelbase(13, 1, "deposit"));
		  amt.sendKeys(readexcelbase(14, 1, "deposit"));
		  desc.sendKeys(readexcelbase(15, 1, "deposit"));
		  sub.click();
		  writeexcelbase(16, 1, "sucess", "deposit");
	  	}
	  public void wihdrw_amt2() throws IOException 
		{
		  withdr.click();
		  accntno.sendKeys(readexcelbase(13, 2, "deposit"));
		  amt.sendKeys(readexcelbase(14, 2, "deposit"));
		  desc.sendKeys(readexcelbase(15, 2, "deposit"));
		  sub.click();
		  writeexcelbase(16, 2, "sucess", "deposit");
		}
	  public void wihdrw_amt3() throws IOException 
		{
		  withdr.click();
		  accntno.sendKeys(readexcelbase(13, 3, "deposit"));
		  amt.sendKeys(readexcelbase(14, 3, "deposit"));
		  desc.sendKeys(readexcelbase(15, 3, "deposit"));
		  sub.click();
		  writeexcelbase(16, 3, "sucess", "deposit");
		}
}
