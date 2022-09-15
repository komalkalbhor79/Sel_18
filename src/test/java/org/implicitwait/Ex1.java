package org.implicitwait;

import java.time.Duration;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ex1 {
	public static void main(String[] args) {
		 System.out.println("Program start");
		 String url="http://localhost/login.do";
		 BaseUtility ut =new BaseUtility();
		 WebDriver driver = ut.startUp("ch", url);
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
		 
	     System.out.println("Program Ends");

}
}