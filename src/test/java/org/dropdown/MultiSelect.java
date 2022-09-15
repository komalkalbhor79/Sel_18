package org.dropdown;


import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



	public class MultiSelect {
		public static void main(String[] args) {
			 System.out.println("Program start");
			 String url="https://demoqa.com/select-menu";
			 BaseUtility ut =new BaseUtility();
			 WebDriver driver = ut.startUp("ch", url);
			 driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
			 WebElement ddl1=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]//div[1]"));
			 ddl1.click();
			  driver.findElement(By.xpath("//div[text()='Red'")).click();
			  driver.findElement(By.xpath("//div[text()='Green'")).click();
			 
			 //System.out.print(driver.getPageSource());
			
			  System.out.println("Program end");
			 
	}
	}	

