
package org.alertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.Utilities.BaseUtility;

public class Ex4 {
	public static void main(String[] args) {
		String url = "https://www.makemytrip.com/";
		BaseUtility bu = new BaseUtility();
		WebDriver driver =bu.startUp("ch",url);
		WebElement ele = driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]"));
		ele.click();
		System.out.println(ele.isSelected());	
		System.out.println(ele.isDisplayed());	
		System.out.println(ele.isEnabled());	
	}

}