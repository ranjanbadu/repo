package Steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.config.BaseClass;
import com.pagefactory.Flights_Home;
import com.pagefactory.Login_Page;

import com.utility.Utility_1;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util_cucu.Helper;

public class FlightTrip  extends BaseClass{
	Flights_Home ft;
	Login_Page lg;
	private static Logger log = LogManager.getLogger(FlightTrip.class);
@BeforeStep()
public void intin() {
	ft=new Flights_Home();
	lg= new Login_Page();
}
 @AfterStep()
 public void teardown() {
 log.info("step ends");
 }
    @Given("^Type of trip to be selected$")
    public void type_of_trip_to_be_selected() throws Throwable {
    	
    	ft.Way();
    }

    @When("^Verify the date block$")
    public void verify_the_date_block() throws Throwable {
    	boolean flag=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isDisplayed();
  // verify.assertTrue(true);
    }

    @Then("^Verify the data$")
    public void verify_the_data() throws Throwable {
  WebElement word=  driver.findElement(By.xpath("//*[@id='availabilityTable0']/tbody/tr[1]/th/div[2]/span[2]"));
 //verify.assertEquals(word.getText(),"DEPARTURE FLIGHT");
    }

    @Then("^City to be Selected$")
    public void city_to_be_selected() throws Throwable {
    	ft.fromTo();
    }

    @And("^Date to be selected$")
    public void date_to_be_selected() throws Throwable {
    	ft.calenderSelect("October", "233", "December", "23");
    }
    @And("^Date to be selected in (.+) (.+) (.+) (.+)$")
    public void date_to_be_selected_in(String month1, String month2, String date1, String date2) throws Throwable {
     ft.calenderSelect(month1, date1, month2, date2);
    }
    @And("^Number of adults to be selected$")
    public void number_of_adults_to_be_selected() throws Throwable {
    	  ft.passengerSel(2);
    }

    @And("^Select Currency$")
    public void select_currency() throws Throwable {
    	 ft.currencySel("INR");
    }

    @And("^Search for the flight$")
    public void search_for_the_flight() throws Throwable {
    ft.search();
    }
}
