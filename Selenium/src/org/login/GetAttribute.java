package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Laksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	Dimension d=new Dimension(500,500);
	driver.manage().window().setSize(d);
	Point p=new Point(250,250);
	driver.manage().window().setPosition(p);
	WebElement user = driver.findElement(By.id("email"));
	String attribute = user.getAttribute("type");
	System.out.println(attribute);
		}
}
