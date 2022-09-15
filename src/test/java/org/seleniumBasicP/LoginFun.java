package org.seleniumBasicP;

import org.Utilities.BaseUtility;
import org.openqa.selenium.WebDriver;

public class LoginFun {
 public static void main(String[] args) {
	 System.out.println("Program start");
	 String url="http://localhost/login.do";
	 BaseUtility ut =new BaseUtility();
	 WebDriver driver = ut.startUp("ch", url);
	 System.out.println("Program Ends");
 }
}
