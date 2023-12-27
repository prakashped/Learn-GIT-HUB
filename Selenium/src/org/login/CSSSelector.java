package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Laksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement user = driver.findElement(By.cssSelector("input#email"));
	user.sendKeys("prakashped@gmail.com");
	WebElement pass = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
	pass.sendKeys("123456");
	
}
}
