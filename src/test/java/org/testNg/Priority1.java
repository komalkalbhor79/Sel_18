package org.testNg;

import org.testng.annotations.Test;

public class Priority1 {
	 @Test(priority=1)
	  public void CreateCustomer() {
		  System.out.println(" CreateCustomer");
	  }
	 
	  @Test(priority=2)
	  public void Login() {
		  System.out.println(" Login");
	  }
	  @Test(priority=6)
	  public void logout() {
		  System.out.println("logout");
	  }
	  @Test
	  public void update() {
		  System.out.println("update");
	  }
	  @Test(priority=4)
	  public void Delete() {
		  System.out.println("Delete");
	  }
	  
	  @Test
	  public void Update() {
		  System.out.println("Update");
	  }

}
