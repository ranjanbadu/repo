package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.BaseClass;
import com.sun.mail.imap.Utility;
import com.utility.Utility_1;

public class Login_Page extends BaseClass{

 public Login_Page(){
	 super();
	 PageFactory.initElements(driver, this);
 }
 

 @FindBy(xpath="//li[@class='li-login float-right tabres']//a[@class='link']")
 private WebElement loginblock;
 
 @FindBy(xpath="//a[contains(text(),'SpiceClub Members')]")
 private WebElement spiceclub; 
 
 @FindBy(xpath="//li[16]//ul[1]//li[2]//ul[1]//li[1]//a[1]")
 private WebElement loginclick;
 
 @FindBy(xpath="//input[@placeholder='Mobile Number']")
 private WebElement phnnumber;
 
 @FindBy(css="[type='password']")
 private WebElement password; 
 
 @FindBy(css="[type='submit']")
 private WebElement submit;
 public void login(String number,String pass) {
	// driver.navigate().to("https://book.spicejet.com/Login.aspx");
	Utility_1.Hover(loginblock );
    Utility_1.HoverAndClick(spiceclub,loginclick);
	phnnumber.sendKeys(number);
	password.sendKeys(pass);
	submit.click();
	
	
 }
	
}
