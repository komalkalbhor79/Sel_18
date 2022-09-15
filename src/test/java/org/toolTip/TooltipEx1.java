package org.toolTip;
import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TooltipEx1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program start");
		String url="https://demoqa.com/tool-tips";
		BaseUtility bu =new BaseUtility();
		WebDriver driver =bu.startUp("ch",url);
		Actions act =new Actions(driver);
        WebElement ele =driver.findElement(By.id("tooltipButton"));
        
		act.moveToElement(ele).perform();
        String tooltip =driver.findElement(By.cssSelector("Tooltip-inner")).getText();
		System.out.println("tooltip :" +tooltip);
		System.out.println("Program End");
	}

}
