package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.config.BaseClass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;



public class ExtentReportUtil extends BaseClass {

   String fileName = reportLocation + "extentreport.html";


    public void ExtentReport() {
        //First is to create Extent Reports
        extent = new ExtentReports();

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Test report for Selenium Basic");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Test report");

        extent.attachReporter(htmlReporter);

    }

    public void ExtentReportScreenshot() throws IOException {
//
//    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        Files.copy(scrFile.toPath(), new File(reportLocation + "screenshot.png").toPath());
//        scenarioDef.fail("details").addScreenCaptureFromPath(reportLocation + "screenshot.png");
    
    }


    public void FlushReport(){
        extent.flush();
    }




}
