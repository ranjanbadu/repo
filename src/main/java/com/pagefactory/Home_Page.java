package com.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.config.BaseClass;

public class Home_Page extends BaseClass {
	public Home_Page() {
		PageFactory.initElements(driver, this);
	}

}
