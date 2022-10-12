package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonAlignFbcrtacnt {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	int female = driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
	int male = driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
	int custom = driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
    if(female==male&&male==custom)
    	System.out.println("radio button is properly allign");
    else
    	System.out.println("radio button is not properly allign");
    driver.close();
	}

}
