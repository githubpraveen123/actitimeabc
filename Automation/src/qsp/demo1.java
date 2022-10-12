package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    String tittle = driver.getTitle();
	System.out.println(tittle);
	driver.close();

	}

}
