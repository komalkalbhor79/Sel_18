package org.alertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.Utilities.BaseUtility;

public class Ex1 {
	public static void main(String[] args) throws Exception{
		String url = "https://www.instagram.com/";
		BaseUtility bu = new BaseUtility();
		WebDriver driver =bu.startUp("chrome",url);
		
		
		
		driver.findElement(By.cssSelector("._2hvTZ.pexuQ.zyHYP")).sendKeys("abc");
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc");
        Thread.sleep(5000);
		
		WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
		System.out.println(login.isEnabled());
		login.click();
		
	}
	
}


