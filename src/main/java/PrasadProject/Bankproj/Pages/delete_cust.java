package PrasadProject.Bankproj.Pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PrasadProject.Bankproj.Base.Base1;



public class delete_cust extends Base1 {

	@FindBy(linkText = "Delete Customer")
	WebElement del_cust;
	@FindBy(name = "cusid")
	WebElement  custid;
	@FindBy(name = "AccSubmit")
	WebElement sub;
	
	public void delete() throws IOException
	{
		
		del_cust.click();
		custid.sendKeys(readexcelbase(14, 8,"Newcust"));
		sub.click();
	}
	public void sub() throws IOException // due to alert not able to handle
	{	
		writeexcelbase(12, 8, "deleted sucessfully", "Newcust");
	}
	
	
  
}
