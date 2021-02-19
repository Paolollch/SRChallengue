package com.paolo.challenge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website {
	
	public WebDriver driver;
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apprater.net/add/");
	}

	public void sendText(String label, String selectorType, String selector, String value) {
		String valueout = (selector.equals("user-submitted-url[]")) ? "https:// " + value : value;		
		driver.findElement(By.name(selector)).sendKeys(valueout);
	}		
}
	
