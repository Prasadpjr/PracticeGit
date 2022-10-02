package PrasadProject.Bankproj.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PrasadProject.Bankproj.Base.Base1;

public class balance_enq extends Base1 
{
	@FindBy(linkText = "Balance Enquiry")
	WebElement balance;
	@FindBy(name = "accountno")
	WebElement accnt_no;
	@FindBy(name = "AccSubmit")
	WebElement sub;
	public void balance() throws IOException
	{
		balance.click();
		accnt_no.sendKeys(readexcelbase(0, 1, "deposit"));
		sub.click();
		writeexcelbase(19, 1, "BalanceEnquiry sucessfully", "deposit");
	}
}
