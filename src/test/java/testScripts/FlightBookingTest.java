package testScripts;
import pageObjects.FlightBooking_PageObject;
import testBase.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FlightBookingTest extends BaseTest {

	/*
	 * Description :: This method will verify results displayed for One way trip or not
	 * */
    @Test(enabled=true)
    public void verify_OneWayJourney()   {
    	FlightBooking_PageObject filghtBooking = PageFactory.initElements(driver, FlightBooking_PageObject.class);
    	filghtBooking.testForOneWayJourney();
    }

}
