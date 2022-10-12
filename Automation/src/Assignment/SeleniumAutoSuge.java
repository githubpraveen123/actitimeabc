package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutoSuge {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	List<WebElement> alllinks = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	int count = alllinks.size();
  System.out.println(count);
for(int i=0;i<count;i++)
{
	String text = alllinks.get(i).getText();
	System.out.println(text);
}
alllinks.get(count-3).click();
driver.close();
	}

}

