package com.scuba.training;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviders {

		@DataProvider(name="inputs")
		public Object[][] getData()
		{
		return new Object[][]
		{
		{"Abirami", "Ramesh"},
		{"Maha", "Ganesh"},
		{"Harsha", "Mohan"}
		};
		}

		@Test(dataProvider="inputs")
		public void testMethod1(String firstname, String surname) {
		System.out.println("Full name: " + firstname + " " + surname);

		}
	
	}


