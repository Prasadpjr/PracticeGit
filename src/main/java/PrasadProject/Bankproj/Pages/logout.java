package PrasadProject.Bankproj.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import PrasadProject.Bankproj.Base.Base1;


public class logout extends Base1 {

  @FindBy(linkText = "Log out") WebElement logout;
  public void log_out() throws IOException
  
  {
	  logout.click();
	  
  }
}
