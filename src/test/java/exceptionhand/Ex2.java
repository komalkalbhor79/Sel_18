package exceptionhand;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex2 {
	public static void main(String[] args)throws Exception {
		System.out.println("*program starts*");
		 String url = "http://omayo.blogspot.com/";
			BaseUtility bu = new BaseUtility();
			WebDriver driver =bu.startUp("ch",url);
			Thread.sleep(5000);
			driver.findElement(By.id("link2")).click();
			
			Set<String> winhdle =  driver.getWindowHandles();
			List<String> windlist = new ArrayList(winhdle);
			for(String id :windlist ) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println("title"+title);
			}
			
			System.out.println("*program ends*");
	}

	
}