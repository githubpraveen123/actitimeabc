package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPast2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	
   WebDriver  driver=new ChromeDriver();
   driver.get("C:\\Users\\Vinod\\Desktop\\Atribute.html");
   driver.findElement(By.xpath("//input[@type='text'and@value='a']")).sendKeys(Keys.CONTROL+"ac");
   driver.findElement(By.xpath("//input[@type='text'and@value='b']")).sendKeys(Keys.CONTROL+"av");

	}

}
