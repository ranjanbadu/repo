package com.listeners;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.gherkin.model.Feature;
import com.config.BaseClass;
import com.utility.Utility_1;

import ExtentReport.ExtentReportUtil;




public class NGTestListener implements ITestListener {
	private static Logger logger = LogManager.getLogger(NGTestListener.class);
    ExtentReportUtil extentReportUtil = new ExtentReportUtil();

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("On test start");
        logger.info("doe");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("On test Sucess");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("On test failure");
        String path = Utility_1.getScreenShotin(iTestResult.getName());
        try {
			BaseClass.scenarioDef.fail("details").addScreenCaptureFromPath(path + "screenshot.png");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("On test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("On test percentage");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("On start");

        extentReportUtil.ExtentReport();

        //ToDo: Feature - Hard coding the feature name
       BaseClass.features = extentReportUtil.extent.createTest(Feature.class, "Search Flight for Trip");

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("On finish");
        extentReportUtil.FlushReport();
    }
}
