package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.config.BaseClass;

public class Js extends BaseClass {
	
	
	public static void sendkeysByJS(WebElement element,WebDriver driver,String value) {
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	 js.executeScript("arguments[0].value='"+value+"';", element);
	}
	public static void clickByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
		
	}
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollintoView(WebDriver driver,WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
	}
	public static String getText(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
  	    //  js.executeScript("return arguments[0].text;",element);
  	    String text =js.executeScript("return arguments[0].text;", element).toString();
  	    return text;
		
	}
	  public static void generateAlert(WebDriver driver, String message){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("alert('"+message+"')");

	    }
}
