package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	//thead
	WebElement table = driver.findElement(By.tagName("table"));
	WebElement thead = driver.findElement(By.tagName("thead"));
	WebElement trow = driver.findElement(By.tagName("tr"));
	List<WebElement> trows = driver.findElements(By.tagName("th"));
	for(int i=0;i<trows.size();i++) {
		WebElement tcrows = trows.get(i);
		String text = tcrows.getText();
		System.out.println(text);
	}
	//tbody
}
}
