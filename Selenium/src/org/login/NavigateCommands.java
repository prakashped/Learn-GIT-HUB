package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Laksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//get method
	driver.get("https://www.facebook.com/");
	driver.get("https://www.amazon.in/");
	driver.get("https://www.facebook.com/");
	driver.get("https://www.amazon.in/");
	//naviagte method
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	}
}
