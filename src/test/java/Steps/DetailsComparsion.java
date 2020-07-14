package Steps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.config.BaseClass;
import com.pagefactory.Flight_detailsPage;
import com.pagefactory.Flights_Home;


import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DetailsComparsion extends BaseClass {
	Flights_Home ft;
	Flight_detailsPage fd;
	private static Logger logger = LogManager.getLogger(DetailsComparsion.class);

	@BeforeStep()
	public void start() {
		logger.info("WebScrapping starts");
		ft = new Flights_Home();
		fd = new Flight_detailsPage();

	}

	@Given("^Navigated to details Page$")
	public void navigated_to_details_page() throws Throwable {
		ft.fromTo();
		ft.calenderSelect("October", "23", "December", "28");
		ft.passengerSel(2);
		ft.currencySel("INR");
		fd = ft.search();
	}

	@Then("^Compare both data$")
	public void compare_both_data() throws Throwable {
		
//		ArrayList get = fd.getFlightdetails("data",
//				"C:\\Users\\Admin\\eclipse-workspace\\Spicejet\\src\\main\\java\\com\\data\\Save.xlsx");
//		
//		
//		ArrayList<String> got = fd.listdata();
//		verify.assertTrue(get.equals(got));

	}

	@And("^Verify filled details$")
	public void verify_filled_details() throws Throwable {

//		verify.assertEquals(fd.getVerifydate(), "FRI 23 OCT, 2020");
//
//		verify.assertEquals(fd.getVerifydetails(), "FARE DETAILS");
	}

	@And("^Fetch data from web table to excel$")
	public void fetch_data_from_web_table_to_excel() throws Throwable {
		fd.create_Data();
		logger.info("passing data  from web table");
	}

}
