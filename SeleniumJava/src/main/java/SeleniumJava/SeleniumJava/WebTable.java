package SeleniumJava.SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("www.google.com");

	}

}
