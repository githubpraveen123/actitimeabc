package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSuggest {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("java");
	Thread.sleep(3000);
	List<WebElement> suggestAll = driver.findElements(By.xpath("(//span[contains(text(),'java')])"));
	int count = suggestAll.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String text = suggestAll.get(i).getText();
		System.out.println(text);
	}
driver.close();
	}

}


