package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRadioAllign {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@rel='async'])")).click();
	Thread.sleep(1000);
 int female = driver.findElement(By.xpath("(//input[@value='1'])")).getLocation().getY();
 int male = driver.findElement(By.xpath("(//input[@value='2'])")).getLocation().getY();
int custome = driver.findElement(By.xpath("(//input[@value='-1'])")).getLocation().getY();
 if(female==male&&male==custome)
	 System.out.println("radio button allign");
 else
	 System.out.println("radio button not allign");
 driver.close();
	}

}
