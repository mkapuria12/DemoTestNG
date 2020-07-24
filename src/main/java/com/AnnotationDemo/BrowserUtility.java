package com.AnnotationDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
	
public static WebDriver driver, driver1;
	
	public static void StartBrowser(String str) throws InterruptedException
	{
		try {
		if(str.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		WebDriverManager.chromedriver().setup();
		
		driver1=new ChromeDriver();
		
		driver1.get("http://google.com");
		
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver1.manage().deleteAllCookies();
				
		}
		else if(str.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();
			
			driver.get("http://google.com");
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(str.equalsIgnoreCase("safari"))
		{
			//WebDriverManager.SafariDriver().setup();
			
			driver=new SafariDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://google.com");
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static void login(String sUsername, String sPassword)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://qa-tekarch.firebaseapp.com/");
		
		driver1.get("http://qa-tekarch.firebaseapp.com/");
		
		WebElement email = driver.findElement(By.id("email_field"));
		
		email.clear();
		
		email.sendKeys(sUsername);

		WebElement password=driver.findElement(By.id("password_field"));
		
		password.clear();

		password.sendKeys(sPassword);

		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();

	}
	
    static void LogOut()
    {
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));

		logout.click();
    }
    
    static void waitForPageElementToVisible(WebElement eleToWait) 
    {
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(eleToWait));
		
	}	
	static void quitBrowser()
	{
		driver.quit();
	}


}
