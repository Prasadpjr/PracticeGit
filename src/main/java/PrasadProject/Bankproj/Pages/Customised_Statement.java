package PrasadProject.Bankproj.Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import PrasadProject.Bankproj.Base.Base1;


public class Customised_Statement extends Base1{
	public WebDriver driver;
	public void Newacnt(WebDriver driver)
	{
		this.driver=driver;
	}
 @FindBy(linkText ="Customised Statement") WebElement customised;
 @FindBy(name = "accountno") WebElement accntno;
 @FindBy(name = "fdate") WebElement fdate;
 @FindBy(name = "tdate") WebElement tdate;
 @FindBy(name = "amountlowerlimit") WebElement mini;
 @FindBy(name = "numtransaction") WebElement transac;
 @FindBy(name = "AccSubmit") WebElement sub;
 
 public void custmsd() throws IOException
 {
	 customised.click();
	 accntno.sendKeys(readexcelbase(6, 1, "deposit"));
	 fdate.sendKeys(readexcelbase(7, 1, "deposit"));
	 fdate.sendKeys(Keys.TAB);
	 fdate.sendKeys(readexcelbase(7, 1, "deposit").substring(readexcelbase(7, 1, "deposit").length()-4));
	 tdate.sendKeys(readexcelbase(8, 1, "deposit"));
	 tdate.sendKeys(Keys.TAB);
	 tdate.sendKeys(readexcelbase(8, 1, "deposit").substring(readexcelbase(8, 1, "deposit").length()-4));	 
	 mini.sendKeys(readexcelbase(9, 1, "deposit"));
	 transac.sendKeys(readexcelbase(10, 1, "deposit"));
	 sub.click();
	 writeexcelbase(25, 1, "CustomisedStatement sucessfully shown", "deposit");
	 
 }
 
 
 
}
