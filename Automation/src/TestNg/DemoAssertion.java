package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void verifytitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle = "Goo  gle";
		String atitle = driver.getTitle();
		if(atitle.equals(etitle)) {
		Reporter.log("title is matching and pass",true);
		}
		else {
			Reporter.log("title is not matching and fail",true);
		}
		driver.close();
	}

}
