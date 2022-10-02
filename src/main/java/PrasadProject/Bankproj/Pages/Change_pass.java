package PrasadProject.Bankproj.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PrasadProject.Bankproj.Base.Base1;

public class Change_pass extends Base1	
{	
		@FindBy(linkText = "Change Password") WebElement change;
		@FindBy(name = "oldpassword") WebElement old_pw;
		@FindBy(name = "newpassword") WebElement new_pw;
		@FindBy(name = "confirmpassword") WebElement cnf_pw;
		@FindBy(name = "sub") WebElement sub;
		
public void change() throws IOException
	{
		change.click();
		old_pw.sendKeys(readexcelbase(0, 1, "changepw"));
		new_pw.sendKeys(readexcelbase(1, 1, "changepw"));
		cnf_pw.sendKeys(readexcelbase(2, 1, "changepw"));
		sub.click();
		writeexcelbase(3, 1, "password changed sucessfully", "changepw");
	}	

}
