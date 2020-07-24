package com.kayak.flight;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.AnnotationDemo.BrowserUtility;


public class flightsearch
{
	WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() throws InterruptedException
	{
		BrowserUtility.StartBrowser("chrome");
	}
	
	@Test
	public void flightButton()
	{
		driver.get("https://www.kayak.com/");
	}
	
	
}

