package PrasadProject.Bankproj.Pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import PrasadProject.Bankproj.Base.Base1;



public class edit_account extends Base1
	{
	@FindBy (linkText = "Edit Account")
	WebElement edit;
	@FindBy (name = "AccSubmit")
	WebElement acc_sub;
	@FindBy (name = "accountno")
	WebElement accntno;
	@FindBy (name = "a_type")
	WebElement accnt_type;
  public void editacnt() throws IOException
  	{
	  edit.click();
	  accntno.sendKeys(readexcelbase(3, 1, "newaccnt"));
	  acc_sub.click();
	  accnt_type.sendKeys("Current");
	  acc_sub.click();
	  writeexcelbase(5, 1, "edited account sucess", "newaccnt");
	  
  	}
  
}
