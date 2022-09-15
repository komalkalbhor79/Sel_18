package org.seleniumBasicP;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Ex1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/driver/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		option.getBrowserName();
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.com/");
		
	}

}
