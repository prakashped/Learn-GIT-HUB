package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Laksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement userId = driver.findElement(By.name("fldLoginUserId"));
	userId.sendKeys("123456");
	driver.navigate().refresh();
	driver.switchTo().parentFrame();
}
}
