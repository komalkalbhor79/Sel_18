package org.seleniumBasicP;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActTimeLogin {
	 public static void main(String[] args) {
		 System.out.println("Program start");
		 String url="http://localhost/login.do";
		 BaseUtility ut =new BaseUtility();
		 WebDriver driver = ut.startUp("ch", url);
		 
		WebElement usernameTextfeild = driver.findElement(By.id("username"));
				usernameTextfeild.sendKeys("admin");
				
		WebElement passwordTextfeild = driver.findElement(By.xpath("//input[@name='pwd']"));
				passwordTextfeild.sendKeys("manager");
				
		WebElement loginTextfeild = driver.findElement(By.id("loginButton"));
				loginTextfeild.click();
		System.out.println("Program Ends");
	 }
	}


