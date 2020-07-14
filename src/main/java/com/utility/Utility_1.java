package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;
import com.config.BaseClass;


public class Utility_1 extends BaseClass {
	
public static long LOAD_TIMEOUT=30;
public static long IMPLICIT_WAIT=30;
static Workbook book;
static Sheet sheet;


public static void switchToFrame(String frame) {
	driver.switchTo().frame(frame);
}
public static void Hover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
public static void HoverAndClick(WebElement elementToHover,WebElement elementToClick) {
	Actions action = new Actions(driver);
	action.moveToElement(elementToHover).click(elementToClick).build().perform();
}
public static Object[][] getTestData(String sheetName,String excel_path ) {
	FileInputStream file = null;
	try {
		file = new FileInputStream(excel_path);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		book = WorkbookFactory.create(file);
	} catch (InvalidFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	sheet = book.getSheet(sheetName);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	// System.out.println(sheet.getLastRowNum() + "--------" +
	// sheet.getRow(0).getLastCellNum());
	for (int i = 0; i < sheet.getLastRowNum(); i++) {
		for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
			data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
		

		}
	}
	return data;
}


public static void getScreenshot(String result) throws IOException {
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String currentdir=System.getProperty("user.dir");
	FileUtils.copyFile(srcfile,new File(currentdir+"/screenshot/"+result+System.currentTimeMillis()+".png"));
}
public static void sendReport(String path) {
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("lightedr@gmail.com", "childhood"));
	email.setSSLOnConnect(true);
	try {
		email.setFrom("lightedr@gmail.com");
		email.setSubject("TestMail");
		email.setMsg(path);
		email.addTo("jayapexviper@gmail.com");
		email.send();
	} catch (EmailException e) {
		System.out.println(e);
	}

}
public static String getScreenShotin(String result) {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir") + "/screenshot/" + result + System.currentTimeMillis()
			+ ".png";
	try {
		FileUtils.copyFile(scrFile, new File(currentDir));
	} catch (IOException e) {

		e.printStackTrace();
	}

	return currentDir;
}

public static void extentstop() {
	extent.flush();

//
//public static void report(ITestResult result) {
//	if (ITestResult.FAILURE == result.getStatus()) {
//		test.log(Status.FAIL, "TEST CASE FAILED IS" + result.getName());
//		test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
//		String path = getScreenShotin(result.getName());
//		try {
//			test.addScreenCaptureFromPath(path);
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//	} else if (ITestResult.SKIP == result.getStatus()) {
//		test.log(Status.SKIP, "TEST CSE SKIPPED IS" + result.getName());
//	} else if (ITestResult.SUCCESS == result.getStatus()) {
//		test.log(Status.PASS, "TEST CASE PASSED IS " + result.getName());
//	}
	
}



}
