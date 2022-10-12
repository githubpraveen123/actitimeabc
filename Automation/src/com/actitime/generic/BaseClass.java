package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	static WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
	
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
		
	}
	@BeforeMethod
	public void LogIn()
	
	{
		FileLib f=new FileLib();
		String un=f.getPropertyData("./data/commondata.property", un);
		String pw=f.getPropertyData("./data/commondata.propery",pw)
				driver.findElement(null)
		
	}
	@AfterClass
	public void LogOut()
	{
		
	}
	
	

}
