package testScripts;

import pageObjects.SignIn_PageObject;
import testBase.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest{

	/*
	 * Description :: This method will verify whether the error is displayed when 
	 * the Sign In Details are not provided
	 * */
    @Test(enabled=true)
    public void verify_SignIn() {
    	
    	SignIn_PageObject signin = PageFactory.initElements(driver, SignIn_PageObject.class);
    	signin.signinTest();
    }

}
