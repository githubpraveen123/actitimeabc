package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeCheckboxCheck {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://timetracker.ctepl.com/actitime");
       boolean select = driver.findElement(By.id("keepLoggedInLabel")).isSelected();
       if(select=true)
    	   System.out.println("status of the check box is present");
       else
    	   System.out.println("status of the check box is not present");
       driver.close();
	}

}
