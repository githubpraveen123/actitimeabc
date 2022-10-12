package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("‪file:///C:/Users/Vinod/Desktop/Hotel.html");
	WebElement MtrListBox = driver.findElement(By.id("mtr"));
	Select s=new Select(MtrListBox);
	s.selectByIndex(0);
	s.selectByValue("d");
	s.selectByVisibleText("vada");
	s.selectByIndex(2);
	s.selectByVisibleText("idly");
	boolean status = s.isMultiple();
	System.out.println(status);
	}


}
