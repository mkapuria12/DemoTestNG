package com.AnnotationDemo;

import org.testng.annotations.*;

public class Different_Annotation {

	@BeforeSuite
	public void print()
	{
		System.out.println("@BeforeSuite-->print");
	}
	@AfterSuite
	public void Print1()
	{
		System.out.println("@AfterSuite-->print1");
	}
	
	@BeforeClass
	public void classPrintBefore()
	{
		System.out.println("@BeforeClass-->printclass");
	}
	
	@AfterClass
	public void ClassPrintAfter()
	{
		System.out.println("@AfterClass-->printclass");
	}
	
	@BeforeTest
	public void print1Test()
	{
		System.out.println("@BeforeTest-->printTest");
	}
	
	@AfterTest
	public void print2Test1()
	{
		System.out.println("@AfterTest-->printTest1");
	}
	
	@Test
	public void checkTest()
	{
		System.out.println("Successful!");
	}
}
