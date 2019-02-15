package com.automation.mobielshop.kpn.GenericFunctionalities;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Tablets;
import com.automation.mobielshop.kpn.uiActions.Telephones;

public class TC002_priceValidation extends TestBase {

	@BeforeClass
	public void setUp() throws Exception{
		//calling init function from testbase class 
		init();
		}	
	
	@Test
	
	/*public void priceValidation_phones() throws InterruptedException
			{
				//creating object to Telephones class to use methods in that class
				Telephones telephones = new Telephones(driver);
				telephones.Cookies_Acceptance();
				Thread.sleep(1000);
				telephones.priceValidation_phones();
//				driver.close();
			}*/
	
	public void priceValidation_tablets() throws InterruptedException	
	{
		
		 //Creating object to tablets page
				Tablets tablets = new Tablets(driver);
				log.info("=========== Started tablets VerifyiProductBuying - With Subscription Test =============");		
		
		//calling Methods from Tablets Class
				tablets.Tablets_product_Buying();
				tablets.priceValidation_tablets();
				Thread.sleep(1000);
		
	}


}
