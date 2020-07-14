package com.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyze implements IRetryAnalyzer {
int counter=0;
int retry=2;

	public boolean retry(ITestResult result) {
if(counter<=retry) {
	counter++;
	return true;
}
	return false;
	}

}
