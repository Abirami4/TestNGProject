package com.scuba.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTestNG {
  @Test
	   @Parameters("myName")
	   public void parameterTest(String myName) {
	      System.out.println("Abirami is Daughter of : " + myName);
	   }
	}

