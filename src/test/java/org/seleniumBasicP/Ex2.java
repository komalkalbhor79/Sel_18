package org.seleniumBasicP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex2 {
	public WebDriver baseUtilit1(String browserName,String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("CH")||browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("start-maximized");
			driver=new ChromeDriver(options);
			//driver.manage().window().maximize();
		}else if(browserName.equalsIgnoreCase("firefox")||browserName.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.out.println("Browser name is invalid");
		}
		driver.get(url);
		return driver;
	}
	public static void main(String[] args) {
		System.out.println("**Start**");
		String url="https://www.saucedemo.com/";
		Ex2 ds=new Ex2();
		WebDriver driver=ds.baseUtilit1("ch", url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("react-burger-menu-btn"))));
		driver.findElement(By.id("react-burger-menu-btn")).click();
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//nav/a[3][@class=\"bm-item menu-item\"]"))));
		driver.findElement(By.xpath("//nav/a[3][@class=\"bm-item menu-item\"]")).click();
		driver.close();
		System.out.println("**Ends**");
	}
}