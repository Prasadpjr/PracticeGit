package PrasadProject.Bankproj.Pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PrasadProject.Bankproj.Base.Base1;



public class edit_cust extends Base1 
	{
	@FindBy(linkText = "Edit Customer")
	WebElement editcust;
	@FindBy(name ="cusid")
	WebElement custid;	
	@FindBy(name ="AccSubmit")
	WebElement submit;
	
	@FindBy (name = "addr")
	WebElement ed_na4;
	@FindBy (name = "city")
	WebElement ed_na5;
	@FindBy (name = "state")
	WebElement ed_na6;
	@FindBy (name = "pinno")
	WebElement ed_na7;
	@FindBy (name = "telephoneno")
	WebElement ed_na8;
	@FindBy (name = "emailid")
	WebElement ed_na9;
	@FindBy (name="sub")
	WebElement ed_na11;
	
public void editcust() throws IOException
	{
	editcust.click();
	custid.sendKeys(readexcelbase(14, 1, "Newcust"));
	submit.click();
	ed_na4.clear();
	ed_na4.sendKeys(readexcelbase(4, 7, "Newcust"));
	ed_na5.sendKeys(readexcelbase(5, 7, "Newcust"));
	ed_na6.sendKeys(readexcelbase(6, 7, "Newcust"));
	ed_na7.sendKeys(readexcelbase(7, 7, "Newcust"));
	ed_na8.sendKeys(readexcelbase(8, 7, "Newcust"));
	ed_na9.sendKeys(readexcelbase(9, 7, "Newcust"));
	ed_na11.click();
	writeexcelbase(12, 7, "edited sucessfully", "Newcust");
	}
}