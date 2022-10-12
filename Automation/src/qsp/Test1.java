package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver=new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
          driver.findElement(By.id("openwindow")).click();
          Set<String> allwh = driver.getWindowHandles();
          for(String wh:allwh) {
        	  driver.switchTo().window(wh);
        	String title = driver.getTitle();
        	System.out.println(title);
        	//  Thread.sleep(3000);
        	//   driver.findElement(By.xpath("//a[text()='Courses']")).click();
          }
          driver.findElement(By.xpath("//a[text()='Courses']")).click();
          
          
	}

}
