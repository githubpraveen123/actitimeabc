package qsp;

import org.openqa.selenium.WebDriver;

public class DemoA {
static void testA(WebDriver driver)
{
	driver.get("https://www.google.com/");
	String tittle=driver.getTitle();
	System.out.println(tittle);
	driver.close();
}
}
