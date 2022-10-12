package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLoginEnable {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	boolean ab = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
	if(ab==true) {
		System.out.println("Login button is enable");
	}
	else
	System.out.println("Login button is not enable");
	driver.close();

	}

}
