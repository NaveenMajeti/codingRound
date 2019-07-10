package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import testBase.BaseTest;

public class SignIn_PageObject extends BaseTest{

	@FindBy(linkText="Your trips")
	private WebElement YourTrips;
	
	@FindBy(id="SignIn")
	private WebElement Signin;
	
	@FindBy(id="signInButton")
	private WebElement SigninButton;
	
	@FindBy(id="errors1")
	private WebElement errors;
	
	public void signinTest() {
		
		waitFor(5000);
		
		// click on yourTrips 
		YourTrips.click();
		System.out.println("[SignIn_PageObject] Clicked on YourTrips Button");
		Signin.click();
		System.out.println("[SignIn_PageObject] Clicked on SignIn Button");
		
		//Wait for sign in frame  
		waitFor(6000);
		
		//click on signin button
		SigninButton.click();
		System.out.println("[SignIn_PageObject] Clicked on SignIn Button in Login PopUp");
		
		String errors1 = errors.getText();
		Assert.assertTrue(errors1.contains("There were errors in your submission"));
	}
}