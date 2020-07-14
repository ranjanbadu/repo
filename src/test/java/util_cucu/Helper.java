package util_cucu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.config.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Helper extends BaseClass {
	
	@Before
	public void initi() {
		BaseClass.init();
	
	}
    @After
public void teardown() {
    	driver.quit();
	
}
}
