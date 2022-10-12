package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement emailbx = driver.findElement(By.id("email"));
int height = emailbx.getSize().getHeight();
int width = emailbx.getSize().getWidth();
System.out.println("height"+height);
System.out.println("width"+width);
driver.close();
	}

}
