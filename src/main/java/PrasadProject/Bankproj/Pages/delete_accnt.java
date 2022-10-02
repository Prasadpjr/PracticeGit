package PrasadProject.Bankproj.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PrasadProject.Bankproj.Base.Base1;


public class delete_accnt extends Base1{
  @FindBy(linkText = "Delete Account") WebElement del_ac;
  @FindBy(name = "accountno") WebElement accntno;
  @FindBy(name = "AccSubmit") WebElement sub;
  public void deleteacc() throws IOException 
  	{
	  del_ac.click();
	  accntno.sendKeys(readexcelbase(3, 5, "newaccnt"));
	  sub.click();
	  writeexcelbase(4, 5, "deleted account proper", "newaccnt");
  	}
}
