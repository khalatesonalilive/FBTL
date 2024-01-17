package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{

	@FindBy(name="firstname")
	private WebElement fname ;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy(name="reg_email__")
	private WebElement emailID ;
	
	@FindBy(name="reg_passwd__")
	private WebElement passW ;
	
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String getRegisterPageURL()
	{
		
	return 	driver.getCurrentUrl();
	}
	
	public void FirstAndLastNameFunctionality(String FirstN, String LastN)
	
	{
		fname.sendKeys(FirstN);
		lname.sendKeys(LastN);
		
	}
	
	public void EmailPass(String emailIDD, String PasssW)
	{
		emailID.sendKeys(emailIDD);
		passW.sendKeys(PasssW);
	}
	
	
	
	
	
}
