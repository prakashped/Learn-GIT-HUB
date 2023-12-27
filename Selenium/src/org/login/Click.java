package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Laksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 //click
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		WebElement password = driver.findElement(By.id("pass"));
		a.click(password).perform();
	//right click
		a.contextClick(password).perform();
	//double click
	driver.get("https://omayo.blogspot.com/");
	WebElement dclick = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
	a.doubleClick(dclick).perform();
	//drag and drop
	driver.get("https://www.demo.guru99.com/test/drag_drop.html");
	WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement target = driver.findElement(By.xpath("//li[@class='placeholder']"));
	a.dragAndDrop(source, target).build().perform();
	//move to element
	WebElement move = driver.findElement(By.xpath("//div[text()='Connect with Us']"));
	a.moveToElement(move).perform();
}
}
