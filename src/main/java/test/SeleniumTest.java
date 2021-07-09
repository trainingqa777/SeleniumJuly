package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		
		initilizeDriver();

	}
	
	public static void initilizeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\MySampleWorks\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
	}

}
