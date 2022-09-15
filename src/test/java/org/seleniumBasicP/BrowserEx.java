package org.seleniumBasicP;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class BrowserEx
 {
  public static void main(String[] args) {
		 
		 String broswerName="CH";
	
		if(broswerName.equalsIgnoreCase("ch")||broswerName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
			ChromeOptions option =new ChromeOptions();
			option.addArguments("Start-maximized");
			ChromeDriver driver=new ChromeDriver(option);
		//	driver.manage().window().maximize();
		 } else if(broswerName.equalsIgnoreCase("ff")||broswerName.equalsIgnoreCase("Firefox")){
			 System.setProperty("webdriver.gacko.driver", "./driver/geckodriver.exe");
			 FirefoxDriver driver=new  FirefoxDriver();
			 driver.manage().window().maximize();
			 
		 } else if(broswerName.equalsIgnoreCase("ed")||broswerName.equalsIgnoreCase("Edge")){
			 System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			 EdgeDriver driver=new EdgeDriver();
			 driver.manage().window().maximize();
		 } else {
			 System.out.println("Invalid browser name");
		 }
	 }
 }