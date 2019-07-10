package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testBase.BaseTest;

public class HotelBooking_PageObject extends BaseTest{

	@FindBy(linkText="Hotels")
	private WebElement hotels;
	
    @FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;
    
    public void searchForHotels() {
    	//clicking on the hotels on the left navigation
    	hotels.click();
    	System.out.println("[HotelBooking_PageObject] Clicked on Hotels Tab");
    	waitFor(4000);
    	
    	// Sending the String to Search in the location
    	localityTextBox.sendKeys("Indiranagar, Bangalore");
    	System.out.println("[HotelBooking_PageObject] Value in the Locality Text Box is provided as :: Indiranagar, Bangalore");
    	waitFor(4000);
    	
    	//Verifying the suggestions
    	List<WebElement> suggestions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
    	suggestions.get(0).click();
    	System.out.println("[HotelBooking_PageObject] Selected the required value from dropdown");
    	
    	//Selecting the traveller selection
    	new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
    	System.out.println("[HotelBooking_PageObject] Selected the '1 room, 2 adults' option from dropdown");
    	
    	//clicking on the search button
    	searchButton.click();
    	System.out.println("[HotelBooking_PageObject] Clicked on Search Hotels Button"); 	
    	
    }

}