package com.bdd.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TestExtenReport extends TestExecutor{
	
	@Test
 public void extentTest() throws InterruptedException
 {
		test =reports.createTest("Alerts");
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Karen Amy\\\\eclipse-workspace\\\\JulySeleniumProject\\\\exe\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximizing the browser
		driver.get("http://demo.automationtesting.in/Alerts.html"); //open URL
		
		
	test.log(Status.PASS, "passsss")	;
	
 }
	
	@Test
	public void newTest()
	{
		test =reports.createTest("New Test case");
		test.log(Status.PASS, "dummy log");
	}
	

}
