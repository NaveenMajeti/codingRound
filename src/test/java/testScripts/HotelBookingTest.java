package testScripts;

import pageObjects.HotelBooking_PageObject;
import testBase.BaseTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HotelBookingTest extends BaseTest {

	/*
	 * Description :: This method will search for the Hotels with details provided
	 * */
    @Test(enabled=true)
    public void search_Hotels() {
    	
     HotelBooking_PageObject hotelbooking = PageFactory.initElements(driver, HotelBooking_PageObject.class);
     hotelbooking.searchForHotels();

    }


}
