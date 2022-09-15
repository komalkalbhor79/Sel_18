package org.Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility {
	public WebDriver startUpWithWM(String browserName,String url ) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("ch")||browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("start-maximized");
			driver=new ChromeDriver(options);  //Open browser
		} else if(browserName.equalsIgnoreCase("ff")||browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();//Open browser	
		} else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();  //Open browser	
		} else {
			System.out.println("Invalid browser Name!!");
		}
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		return driver;
	}

	public WebDriver startUp(String browserName,String url ) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("ch")||browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\workspace\\April_18_Selenium\\driver\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("start-maximized");
			driver=new ChromeDriver(options);  //Open browser
		} else if(browserName.equalsIgnoreCase("ff")||browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\workspace\\April_18_Selenium\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();//Open browser	
		} else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","D:\\workspace\\April_18_Selenium\\driver\\msedgedriver.exe");
			driver=new EdgeDriver();  //Open browser	
		} else {
			System.out.println("Invalid browser Name!!");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		return driver;
	}

	public void waitForVisibilityodElement(WebDriver driver, int i, WebElement ele) {
		// TODO Auto-generated method stub
		 WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10));
		 wt.until(ExpectedConditions.visibilityOf(ele));
	}

	public void scrollByJS(WebDriver driver, WebElement ddl1) {
		// TODO Auto-generated method stub
		
	}

}
	