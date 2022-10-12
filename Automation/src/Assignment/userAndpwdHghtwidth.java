package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class userAndpwdHghtwidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement user = driver.findElement(By.id("username"));
		int userheight = user.getSize().getHeight();
		WebElement pwd = driver.findElement(By.name("pwd"));
		int pwdheight = pwd.getSize().getHeight();
		int userwidth = user.getSize().getWidth();
		int pwdwidth = pwd.getSize().getWidth();
		if(userheight==pwdheight&&userwidth==pwdwidth)
					System.out.println("pass");
		
		else
			System.out.println("fail");

		}
	}

