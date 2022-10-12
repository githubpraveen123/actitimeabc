package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutClose {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
   ChromeDriver driver = new ChromeDriver();
   Thread.sleep(1000);
   driver.manage().window().maximize();
   Thread.sleep(1000);
   driver.manage().deleteAllCookies();
   Thread.sleep(1000);
   driver.quit();
   

	}

}
