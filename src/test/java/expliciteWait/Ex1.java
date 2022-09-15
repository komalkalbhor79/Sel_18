package expliciteWait;
import java.time.Duration;
import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Ex1 {
	public static void main(String[] args) {
		 System.out.println("Program start");
		 String url="http://localhost/login.do";
		 BaseUtility ut =new BaseUtility();
		 WebDriver driver = ut.startUp("ch", url);
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(15));
		 wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
		 driver.findElement(By.id("logoutLink")).click();
	     System.out.println("Program Ends");
	 }
}
