package PrasadProject.Bankproj.Pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import PrasadProject.Bankproj.Base.Base1;


public class Fund_transf extends Base1
{
	  @FindBy(linkText = "Fund Transfer") WebElement fund;
	  @FindBy(name = "payersaccount") WebElement payer_acnt;
	  @FindBy(name = "payeeaccount") WebElement payee_acnt;
	  @FindBy(name = "ammount") WebElement amt;
	  @FindBy(name = "desc") WebElement desc;
	  @FindBy(name = "AccSubmit") WebElement sub;
	public void fundtransfr1() throws IOException 
	  	{
		  fund.click();
		  payer_acnt.sendKeys(readexcelbase(0, 1, "fundtransfr"));
		  payee_acnt.sendKeys(readexcelbase(1, 1, "fundtransfr"));
		  amt.sendKeys(readexcelbase(2, 1, "fundtransfr"));
		  desc.sendKeys(readexcelbase(3, 1, "fundtransfr"));
		  sub.click();
		  writeexcelbase(4, 1, "sucess", "fundtransfr");
	  	}
	public void fundtransfr2() throws IOException 
  	{
	  fund.click();
	  payer_acnt.sendKeys(readexcelbase(0, 2, "fundtransfr"));
	  payee_acnt.sendKeys(readexcelbase(1, 2, "fundtransfr"));
	  amt.sendKeys(readexcelbase(2, 2, "fundtransfr"));
	  desc.sendKeys(readexcelbase(3, 2, "fundtransfr"));
	  sub.click();
	  writeexcelbase(4, 2, "sucess", "fundtransfr");
  	}
}
