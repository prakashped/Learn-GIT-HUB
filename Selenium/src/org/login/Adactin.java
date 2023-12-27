package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Laksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/");
	 WebElement username = driver.findElement(By.id("username"));
	 username.sendKeys("prakashped");
	 WebElement password = driver.findElement(By.id("password"));
	 password.sendKeys("devi1989");
	 WebElement loginButton = driver.findElement(By.id("login"));
	 loginButton.click();
	 WebElement location = driver.findElement(By.id("location"));
	 Select s=new Select(location);
	 s.selectByValue("Sydney");
	 WebElement hotels = driver.findElement(By.id("hotels"));
	 Select s1=new Select(hotels);
	 s1.selectByIndex(0);
	 WebElement roomType = driver.findElement(By.id("room_type"));
	 Select s2=new Select(roomType);
	 s2.selectByVisibleText("Super Deluxe");
	 WebElement noOfRooms = driver.findElement(By.name("room_nos"));
	 Select s3=new Select(noOfRooms);
	 s3.selectByValue("2");
	 WebElement adultsPerRoom = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
	 Select s4=new Select(adultsPerRoom);
	 s4.selectByIndex(1);
	 WebElement childrenPerRoom = driver.findElement(By.name("child_room"));
	 Select s5=new Select(childrenPerRoom);
	 s5.selectByValue("2");
	 WebElement search = driver.findElement(By.id("Submit"));
	 search.click();
}
}
