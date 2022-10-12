package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbVerifyLogo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/login");
    
   boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
    if(logo==true) {
    	System.out.println("pass");
    }
    else {
    	System.out.println("fail");
	}
    driver.close();
	}
}
