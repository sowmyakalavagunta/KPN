package com.automation.mobielshop.kpn.GenericFunctionalities;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Tablets;

public class TCOO1_pageLoadValidation extends TestBase {
	
	
	
	@BeforeClass
	public void setUp() throws Exception{
		//calling init function from testbase class 
		init();
		}
	
	@Test
	public void pageValidation_tablets() throws InterruptedException {
		
		//Creating object to tablets page
		Tablets tablets = new Tablets(driver);
		log.info("=========== Started tablets VerifyiProductBuying - With Subscription Test =============");		
		//calling Methods from Tablets Class
		tablets.Tablets_product_Buying();	
		Thread.sleep(3000);
		tablets.pageLoadValidation();	
		
	}
	

}
