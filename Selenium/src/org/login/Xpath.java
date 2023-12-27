package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//xpath
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("prakashped@gmail.com");
		//xpath by index
		WebElement pass = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]"));
		pass.sendKeys("12345");
		//xpath by Text
		WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String text2 = text.getText();
		System.out.println(text2);
		//xpath by Partial Text
		WebElement partialText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		System.out.println("partialText");
		
	}

}
