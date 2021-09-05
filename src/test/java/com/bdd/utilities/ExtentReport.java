package com.bdd.utilities;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentreport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlreporter);
		
		ExtentTest test = report.createTest("My First Report");
		test.log(Status.PASS, "test case passed");
		test.log(Status.FAIL, "test case failed");
		test.log(Status.INFO, "test information");
		test.addScreenCaptureFromPath("e:\\\\\\\\Karen Amy\\\\\\\\Desktop\\\\\\\\Screenshot\\\\\\\\failure.png");
		
		report.flush();

	}

}
