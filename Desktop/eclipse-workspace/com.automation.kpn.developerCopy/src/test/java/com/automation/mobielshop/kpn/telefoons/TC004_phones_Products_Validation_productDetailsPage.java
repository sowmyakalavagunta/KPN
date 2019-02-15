package com.automation.mobielshop.kpn.telefoons;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Telephones;

public class TC004_phones_Products_Validation_productDetailsPage extends TestBase {
	
	@BeforeClass
	public void setUp() throws Exception{
		//calling init function from testbase class 
		init();
		}
	
	
	@Test
	public void DetailsPageValidation() throws InterruptedException
	{
		
		//creating object to Telephones class to use methods in that class
				Telephones telephones = new Telephones(driver);
					telephones.DetailsPageValidation_subscription();
						telephones.DetailsPageValidation_slider();	
//										Thread.sleep(3000);
//											telephones.DetailsPageValidation_Heading();			
	}	
	
	/*@AfterTest	
	public void EndTest()
	{
	driver.close();
	}*/
}
