package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Index {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement drop = driver.findElement(By.id("drop1"));
		drop.click();
		Select s=new Select(drop);
		s.selectByIndex(1);
		s.deselectByValue("mno");
		s.selectByVisibleText("doc 3");
	}

}
