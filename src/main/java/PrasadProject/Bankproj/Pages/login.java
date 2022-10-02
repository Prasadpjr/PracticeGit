package PrasadProject.Bankproj.Pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import PrasadProject.Bankproj.Base.Base1;




public class login extends Base1 {

	
	@FindBy(name="uid")
	WebElement id;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(name="btnLogin")
	WebElement btn;

  public void Login() throws IOException  
  {
	  id.sendKeys(readexcelbase(0,1,"login")); 
	  pass.sendKeys(readexcelbase(1,1,"login"));
	  btn.click();
  }

}
