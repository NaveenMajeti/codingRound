package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import testBase.BaseTest;

public class FlightBooking_PageObject extends BaseTest{
	@FindBy(id="OneWay")
	private WebElement Oneway;
	
	@FindBy(xpath="//*[@data-idfield='from']")
	private WebElement FromLocation;
	
	@FindBy(xpath="//*[@data-idfield='from']")
	private WebElement ToLocation;
	
	@FindBy(xpath="//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
	private WebElement Datepicker;
	
	@FindBy(id="SearchBtn")
	private WebElement searchButton;
	
	
	public void testForOneWayJourney() {
		 waitFor(2000);
		 Oneway.click();
		 System.out.println("[FlightBooking_PageObject] Clicked on One Way Radio Button");
		 FromLocation.clear();
		 System.out.println("[FlightBooking_PageObject] Cleared the Value of FromLocation");
		 FromLocation.sendKeys("Bangalore");
		 System.out.println("[FlightBooking_PageObject] Value provided in the From Location is :: Bangalore");
		 //wait for the auto complete options to appear for the origin
		 waitFor(4000);
		 
		 //select the first item from the destination auto complete list  
		 List<WebElement> originOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
	     originOptions.get(0).click();
	     System.out.println("[FlightBooking_PageObject] Selected the Bangalore from the Origin dropdown");
	    
	     ToLocation.clear();
	     System.out.println("[FlightBooking_PageObject] Cleared the Value of To Location");
	     
	     ToLocation.sendKeys("Delhi");
	     System.out.println("[FlightBooking_PageObject] Value provided in the To Location is :: Delhi");
	     //wait for the auto complete options to appear for the destination
	     
	     waitFor(4000);
	     
	     //select the first item from the destination auto complete list
	     List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
	     destinationOptions.get(0).click();
	     System.out.println("[FlightBooking_PageObject] Selected the Delhi from the destination dropdown");
	     
	     Datepicker.click();
	     System.out.println("[FlightBooking_PageObject] Clicked on the Date Picker and clicked on the 21 of this month");
	     
	     //all fields filled in. Now click on search
	     searchButton.click();
	     System.out.println("[FlightBooking_PageObject] Clicked on the Search Button");	
	     waitFor(5000);
	     //verify that result appears for the provided journey search
	     Assert.assertTrue(isElementPresent(By.className("searchSummary")));
		 
	}

	 private boolean isElementPresent(By by) {
	        try {
	            driver.findElement(by);
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }

}
