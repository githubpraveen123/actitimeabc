package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPresentorNot {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/");
    boolean present = driver.findElement(By.id("keepLoggedInCheckBox")).isEnabled();
    if(present==true)
    	System.out.println("check box is present");
    else
    	System.out.println("check box is not present");
    driver.close();
	}

}
