package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCheckBoxCheck {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://timetracker.ctepl.com/actitime");
		boolean select = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(select==true)
			System.out.println("status checkbox is selected");
		else
			System.out.println("status checkbox is not selected");
		driver.close();
	}

}
