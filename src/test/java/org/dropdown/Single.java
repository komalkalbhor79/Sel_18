package org.dropdown;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Single {
	public static void main(String[] args) {
		 System.out.println("Program start");
		 String url="https://demoqa.com/select-menu";
		 BaseUtility ut =new BaseUtility();
		 WebDriver driver = ut.startUp("ch", url);
		 WebElement ddl1=driver.findElement(By.cssSelector("#withOptGroup  .css-1hwfws3"));
		 ddl1.click();
		 ut.scrollByJS(driver, ddl1);
       WebElement ele= driver.findElement(By.xpath("//div[text()='Group 2,Option 2']"));
		
         ele.click();
		 //System.out.print(driver.getPageSource());
		
		
		 
}
}	