package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;

public class RegisterPageSteps extends BaseClass{
public static RegisterPage registerPage;
	
	@Given("user is on FB RegisterPage and validate FB URL")
	public void user_is_on_fb_register_page_and_validate_fb_url() {
	    
		BaseClass.initialization();
		 registerPage=new RegisterPage();
	String actualUrl=	 registerPage.getRegisterPageURL();
	boolean a=actualUrl.contains("reg");
	Assert.assertEquals(a, true);
	
	}
	
	@Given("user enters a valid firstname and lastname")
	public void user_enters_a_valid_firstname_and_lastname() {
		registerPage.FirstAndLastNameFunctionality("Anuja", "Bhosale");
	}
	
	@Given("user enters a valid emailId and Password")
	public void user_enters_a_valid_email_id_and_password() {
		registerPage.EmailPass("bhosaleanuja@gmail.com", "anujabhosale123");
	}
}
