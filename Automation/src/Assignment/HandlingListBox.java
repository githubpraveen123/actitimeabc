package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(3000);
	WebElement MonthListbox = driver.findElement(By.id("month"));
	Select s=new Select(MonthListbox);
	s.selectByVisibleText("Jun");
	Thread.sleep(3000);
	s.selectByIndex(7);
	Thread.sleep(3000);
	s.selectByValue("11");
	driver.close();
	}

}
