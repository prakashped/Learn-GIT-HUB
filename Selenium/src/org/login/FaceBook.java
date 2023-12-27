package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("prakash@gmail.com");
		WebElement passWord = driver.findElement(By.name("pass"));
		passWord.sendKeys("123456");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		WebElement txt = driver.findElement(By.tagName("h2"));
		String text = txt.getText();
		System.out.println(text);
		WebElement linkText = driver.findElement(By.linkText("Forgotten password?"));
		String text2 = linkText.getText();
		System.out.println(text2);
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Forgotten"));
		String text3 = partialLinkText.getText();
		System.out.println(text3);

	}

}
