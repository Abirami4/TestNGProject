package com.scuba.training;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class GroupingEX {
  @Test
  public void First() {
	  System.out.println("Abi");
  }
  @Test
  public void Second() 
  {
	  System.out.println("Swe");
  }
  @Test
  public void Third() 
  {
	  System.out.println("Mehar");
  }
  @Test(groups = "Smoke")
  public void Twelve() 
  {
	  System.out.println("Dilshed Banu");
  }
  @Test(groups = "sanity")
  public void Four()
  {
	  System.out.println("Helen");
  }
  @Test(groups = "Smoke")
  public void Five() 
  {
	  System.out.println("Jeni");
	 
  }
  @BeforeTest(groups = "Smoke")
  public void Six() 
  {
	  System.out.println("\nFriendsForever");
  
  }
  @AfterTest
  public void Ten() 
  {
	  System.out.println("Have a Great Day");
  
  }
  @BeforeMethod
  public void Seven() 
  {
	  System.out.println("**************");
  
  }
  @AfterSuite
  public void Eight() 
  {
	  System.out.println("End");
  
  }
  @BeforeSuite
  public void Eleven() 
  {
	  System.out.println("Friends List");
  
  }
  @AfterMethod
  public void Nine() 
  {
	  System.out.println("Completed BCA");
  
  }
  
}

