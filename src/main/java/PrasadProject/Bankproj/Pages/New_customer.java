package PrasadProject.Bankproj.Pages;

import java.io.IOException;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PrasadProject.Bankproj.Base.Base1;




public class New_customer extends Base1 {
	
	@FindBy(linkText = "New Customer")
	 WebElement new_cust;
	@FindBy (name = "name")
	WebElement na1;
	@FindBy (xpath = "//input[@value='f']")
	WebElement na2;
	@FindBy (xpath = "//input[@value='m']")
	WebElement na12;
	@FindBy (name = "dob")
	WebElement na3;	
	@FindBy (name = "addr")
	WebElement na4;
	@FindBy (name = "city")
	WebElement na5;
	@FindBy (name = "state")
	WebElement na6;
	@FindBy (name = "pinno")
	WebElement na7;
	@FindBy (name = "telephoneno")
	WebElement na8;
	@FindBy (name = "emailid")
	WebElement na9;
	@FindBy (name = "password")
	WebElement na10;
	@FindBy (name="sub")
	WebElement na11;
// customer 1 created --->	
	public void newcust1_click() throws Throwable
		{
		new_cust.click();
		na1.sendKeys(readexcelbase(1,1,"Newcust"));
		na2.click();
		na3.sendKeys(readexcelbase(3,1,"Newcust"));
		na3.sendKeys(Keys.TAB);
		na3.sendKeys(readexcelbase(3,1,"Newcust").substring(readexcelbase(3,1,"Newcust").length()-4));
		na4.sendKeys(readexcelbase(4,1,"Newcust"));
		na5.sendKeys(readexcelbase(5,1,"Newcust"));
		na6.sendKeys(readexcelbase(6,1,"Newcust"));
		na7.sendKeys(readexcelbase(7,1,"Newcust"));
		na8.sendKeys(readexcelbase(8,1,"Newcust"));
		na9.sendKeys(readexcelbase(9,1,"Newcust"));
		na10.sendKeys(readexcelbase(10,1,"Newcust"));
		na11.click();
		//isAlertPresent();
		writeexcelbase(12, 1, "sucessfully created", "Newcust");
		}
// customer 2 created --->		
	public void newcust2_click() throws IOException
		{
		new_cust.click();
		na1.sendKeys(readexcelbase(1,2,"Newcust"));
		na12.click();
		na3.sendKeys(readexcelbase(3,2,"Newcust"));
		na3.sendKeys(Keys.TAB);
		na3.sendKeys(readexcelbase(3,2,"Newcust").substring(readexcelbase(3,1,"Newcust").length()-4));
		na4.sendKeys(readexcelbase(4,2,"Newcust"));
		na5.sendKeys(readexcelbase(5,2,"Newcust"));
		na6.sendKeys(readexcelbase(6,2,"Newcust"));
		na7.sendKeys(readexcelbase(7,2,"Newcust"));
		na8.sendKeys(readexcelbase(8,2,"Newcust"));
		na9.sendKeys(readexcelbase(9,2,"Newcust"));
		na10.sendKeys(readexcelbase(10,2,"Newcust"));
		na11.click();
		writeexcelbase(12, 2, "sucessfully created", "Newcust");
		}
// customer 3 created --->	
	public void newcust3_click() throws IOException
		{
		new_cust.click();
		na1.sendKeys(readexcelbase(1,3,"Newcust"));
		na12.click();
		na3.sendKeys(readexcelbase(3,3,"Newcust"));
		na3.sendKeys(Keys.TAB);
		na3.sendKeys(readexcelbase(3,3,"Newcust").substring(readexcelbase(3,1,"Newcust").length()-4));
		na4.sendKeys(readexcelbase(4,3,"Newcust"));
		na5.sendKeys(readexcelbase(5,3,"Newcust"));
		na6.sendKeys(readexcelbase(6,3,"Newcust"));
		na7.sendKeys(readexcelbase(7,3,"Newcust"));
		na8.sendKeys(readexcelbase(8,3,"Newcust"));
		na9.sendKeys(readexcelbase(9,3,"Newcust"));
		na10.sendKeys(readexcelbase(10,3,"Newcust"));
		na11.click();
		writeexcelbase(12, 3, "sucessfully created", "Newcust");
		}
// customer 4 created --->	
	public void newcust4_click() throws IOException
		{
		new_cust.click();
		na1.sendKeys(readexcelbase(1,4,"Newcust"));
		na12.click();
		na3.sendKeys(readexcelbase(3,4,"Newcust"));
		na3.sendKeys(Keys.TAB);
		na3.sendKeys(readexcelbase(3,4,"Newcust").substring(readexcelbase(3,1,"Newcust").length()-4));
		na4.sendKeys(readexcelbase(4,4,"Newcust"));
		na5.sendKeys(readexcelbase(5,4,"Newcust"));
		na6.sendKeys(readexcelbase(6,4,"Newcust"));
		na7.sendKeys(readexcelbase(7,4,"Newcust"));
		na8.sendKeys(readexcelbase(8,4,"Newcust"));
		na9.sendKeys(readexcelbase(9,4,"Newcust"));
		na10.sendKeys(readexcelbase(10,4,"Newcust"));
		na11.click();
		writeexcelbase(12, 4, "sucessfully created", "Newcust");
		}
// customer 5 created --->	
	public void newcust5_click() throws IOException
		{
		new_cust.click();
		na1.sendKeys(readexcelbase(1,5,"Newcust"));
		na2.click();
		na3.sendKeys(readexcelbase(3,5,"Newcust"));
		na3.sendKeys(Keys.TAB);
		na3.sendKeys(readexcelbase(3,5,"Newcust").substring(readexcelbase(3,1,"Newcust").length()-4));
		na4.sendKeys(readexcelbase(4,5,"Newcust"));
		na5.sendKeys(readexcelbase(5,5,"Newcust"));
		na6.sendKeys(readexcelbase(6,5,"Newcust"));
		na7.sendKeys(readexcelbase(7,5,"Newcust"));
		na8.sendKeys(readexcelbase(8,5,"Newcust"));
		na9.sendKeys(readexcelbase(9,5,"Newcust"));
		na10.sendKeys(readexcelbase(10,5,"Newcust"));
		na11.click();
		writeexcelbase(12, 5, "sucessfully created", "Newcust");
		}

	
}

	
		

