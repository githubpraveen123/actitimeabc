package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontAndSize {	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.facebook.com/");
    String fontsize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("Font");
    System.out.println(fontsize);
    driver.close();
	}

}
