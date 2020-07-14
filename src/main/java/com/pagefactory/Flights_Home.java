package com.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.config.BaseClass;

public class Flights_Home extends BaseClass {
	public Flights_Home() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@id='travelOptions']//div[@id='OneWay']/input")
	@CacheLookup
	private WebElement oneWay_rd;
	
	@FindBy(id = "ctl00_mainContent_rbtnl_Trip_1")
	@CacheLookup
	private WebElement roundTrip_rd;
	
	@FindBy(xpath = "//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_TripPlanner']")
	@CacheLookup
	private WebElement multicity_rd;

	@FindBy(xpath = "//div[@id='travelOptions']//label[contains(text(),'One Way')]")
	@CacheLookup
	private WebElement oneWay_lb;
	
	@FindBy(xpath = "//label[@class='selected-label']")
	@CacheLookup
	private WebElement roundTrip_lb;
	
	@FindBy(xpath = "//label[contains(text(),'Multicity')]")
	@CacheLookup
	private WebElement multicity_lb;
	
	@FindBy(xpath = "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
	@CacheLookup
	private WebElement departboxclick;
	
	@FindBy(xpath="//a[@value='GOI']") 
	@CacheLookup 
	private WebElement departcity;
	
	@FindBy(css="[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] [value='DEL']") 
	@CacheLookup 
	private WebElement destcity;
	
	@FindBy(css="td[data-handler='selectDay']")
	@CacheLookup
	private List<WebElement>date;
	

	@FindBy(xpath="//div[@id='Div1']/button")
	@CacheLookup 
	private WebElement next_cal;
	
	
	@FindBy(css="td[data-handler='selectDay']")
	@CacheLookup
	private List<WebElement>redate;

	@FindBy(xpath="//div[@id='ui-datepicker-div']/div[2]/div/a/span")
	//@CacheLookup 
	private WebElement month_next;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div[1]/div/div/span[1]")
	//@CacheLookup
	private WebElement month_name;
	
	@FindBy(css="[id*='ctl00_mainContent_DropDownListCurrency']") 
	@CacheLookup 
	private WebElement currencySelect;
	
	@FindBy(xpath="//div[@id='divpaxinfo']") 
	@CacheLookup private 
	WebElement Passengerclick;
	
	@FindBy(xpath="//select[contains(@name,'ctl00$mainContent$ddl_Adult')]") 
	@CacheLookup 
	private WebElement adultselect;
	
	
	@FindBy(css="input[id='ctl00_mainContent_btn_FindFlights']") 
	@CacheLookup 
	private WebElement searchclick;
	
	public void currencySel(String value) {
		Select curr=new Select(currencySelect);
		curr.selectByVisibleText(value);
	}
	public Flight_detailsPage search() {
		searchclick.click();
		return new Flight_detailsPage();
	}

	public void passengerSel(int adult_num) {
		Passengerclick.click();
		Select adult=new Select(adultselect);
		adult.selectByIndex(adult_num);
		
	}
	
	
 public void Way() {
//	boolean flag= roundTrip_rd.isSelected();
//	 if(flag==false) 
	 roundTrip_rd.click();
    
 }
 public void fromTo() {
	 departboxclick.click();
	 departcity.click();
	 destcity.click();
	 
	 
 }
// driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/div/a/span"))
 //driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div/div/span[1]"))
	public void calenderSelect(String month,String dat,String month_ret,String date_ret)  {
		while(!month_name.getText().contains(month)) {
			month_next.click();
		}
		for(int i = 0;i <date.size();i++) {
			String text =date.get(i).getText();
			if(text.equalsIgnoreCase(dat)) {
				date.get(i).click();
				break;
				}
		}
	
		next_cal.click();
		while(!month_name.getText().contains(month_ret)) {
		month_next.click();	
		}

		for(int j = 0;j<redate.size();j++) {
			String rettext=redate.get(j).getText();
			if(rettext.equalsIgnoreCase(date_ret)) {
			redate.get(j).click();
			}
		}
}
	
}

