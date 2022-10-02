package PrasadProject.Bankproj.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import PrasadProject.Bankproj.Base.Base1;


public class mini_statement extends Base1 
{
	@FindBy(linkText = "Mini Statement")
	WebElement minis;
	@FindBy(name = "accountno")
	WebElement accnt_no;
	@FindBy(name = "AccSubmit")
	WebElement sub;

	public void mini_state() throws IOException
	{
		minis.click();
		accnt_no.sendKeys(readexcelbase(0, 1, "deposit"));
		sub.click();
		writeexcelbase(22, 1, "MiniStatement sucessfully", "deposit");
	}
}

