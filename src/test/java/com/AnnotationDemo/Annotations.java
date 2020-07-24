package com.AnnotationDemo;

import org.testng.annotations.*;

public class Annotations{
	
	@BeforeSuite
	public void launchBrowser() throws InterruptedException
	{
		BrowserUtility.StartBrowser("chrome");
	}
	
	@Test
	public void LoginPage()
	{
		BrowserUtility.login("admin123@gmail.com", "admin123");
		System.out.println("logged in successfully!");
	}
	
	@Ignore
	@Test
	public void Logout()
	{
		BrowserUtility.LogOut();
	}
	
	@Test
	public void loginPage()
	{
		BrowserUtility.login("admin123@gmail.com", "admin12");
		System.out.println("log in failed!");

	}
	
	@AfterTest
	public void logout()
	{
		BrowserUtility.LogOut();
	}
	
	@AfterSuite
	public void quitBrowser()
	{
		BrowserUtility.quitBrowser();
	}

}
