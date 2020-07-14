package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
//import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utility.Utility_1;

public class BaseClass {
	public static Properties locators;
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	// public static WebEvent_listener eventlistener;
	public static Workbook book;
	public static Sheet sheet;
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
	public static WebDriver Driver;
	//////////////
   // public ExtentReports extent;
	public static ExtentTest scenarioDef;

	public static ExtentTest features;

public static String reportLocation = System.getProperty("user.dir")+"/screenshot/";

//public static SoftAssert verify;
	public BaseClass() {
		// System.getProperty("user.dir") +
		// "\\src\\main\\java\\com\\config\\homepage.properties");
		prop = new Properties();
		FileInputStream in;
		try {
			in = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\config\\homepage.properties");
			try {
				prop.load(in);
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
//		verify = new SoftAssert();
//		htmlReporter = new ExtentHtmlReporter("testreport.html");
//		extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
	}

	public static void init() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriver_path"));
			// System.setProperty("Webdriver.chrome.logfile","./chromelog.txt");
			driver = new ChromeDriver();
		} else if (browsername.equals("opera")) {
			// System.setProperty(key, value);
			driver = new OperaDriver();

		}

//		e_driver=new EventFiringWebDriver(driver);
//		eventlistener = new WebEvent_listener();
//	    e_driver.register(eventlistener);
//		driver=e_driver;
		driver.manage().window().maximize();
		;
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utility_1.LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utility_1.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

}
