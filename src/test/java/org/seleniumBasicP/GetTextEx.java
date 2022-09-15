package org.seleniumBasicP;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTextEx {
	public static void main(String[] args) {
		 System.out.println("Program start");
		 String url="https://demoqa.com/radio-button";
		 BaseUtility ut =new BaseUtility();
		 WebDriver driver = ut.startUp("ch", url);
         WebElement ele=driver.findElement(By.cssSelector("[for='yesRadio']"));
         System.out.println(ele.getText());
         System.out.println("Program end");
}
}