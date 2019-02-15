package com.automation.mobielshop.kpn.prepaid;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Prepaid;

public class TC002_Prepaid_Validation_PriceDetails extends TestBase
{
	@BeforeTest
	public void setUp() throws Exception{
		 init();		 
	}	
	
	
	@Test
	public void  priceValidation_Prepaid_EndToEnd() throws InterruptedException {
		
		//Creating Object to SimOnly CLass
			Prepaid prepaid= new Prepaid(driver);
			log.info("******Started smoke test for prepaid page******");	
				log.info("*****Started Price Validation for PrePaid*****");

		//Calling Methods from prepaid  class
//				prepaid.Cookies_Acceptance();
					Thread.sleep(3000);
						prepaid.Prepaid_Buying_ClickingonLink();
							Thread.sleep(1000);
								prepaid.Prepaid_Buying_CatPAge();
									Thread.sleep(1000);
		
		// Creating Object to PriceValidation
			PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);
				
		// Calling Methods from PriceValidation Class	
			priceValidation_HardwareONly.priceValidation_Prepaid_pdpPage();
					Thread.sleep(1000);	
						priceValidation_HardwareONly.PriceValidation_FromShoppingCartPageToPersoanlDetailsPage_HardwareOnly();		
					
					
				//Creating object to Personal_Information Class
					Personal_information personal_Information=new Personal_information(driver);	
				//calling Methods from Personal_Information Class
					personal_Information.personal_Details_TillResidenceDetails();				
						personal_Information.NextOne();				
							Thread.sleep(7000);	
					
				// Calling Methods from PriceValidation Class
					priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_HardwareOnly();
						priceValidation_HardwareONly.pricesValidation_HardwareOnly_Prepaid();
					
						log.info("******Finished smoke test for prepaid page******");	
							log.info("*****Finished Price Validation for PrePaid*****");

	
}
}