package com.bdd.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;


public class TestExecutor {
	
	public static WebDriver driver;

	public static ExtentHtmlReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	
	@BeforeTest
	public void createreport()
	{
		 reporter = new ExtentHtmlReporter("extentreport.html");
		 reports = new ExtentReports();
		reports.attachReporter(reporter);
	}
	

	@AfterMethod
	public void end()
	{
		reports.flush();
	}
	
	
	public void generatereport(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("e:\\Karen Amy\\Desktop\\Screenshot\\failure.png"));
			String destination = "e:\\\\Karen Amy\\\\Desktop\\\\Screenshot\\\\failure.png";
			test.log(Status.FAIL, "Screenshot attached"+test.addScreenCaptureFromPath(destination));
		}
		
	}
	
	

}
