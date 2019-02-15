package com.automation.mobielshop.kpn.mobielInternet;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.MobielInternet;

public class TC002_MobielInternet_Products_validation_priceDetails extends TestBase{
	
	@BeforeTest
	public void setUp() throws Exception{
		 init();		 
	}	
	
	
	@Test
	public void priceValidation_MobielInternet_EndToEnd() throws InterruptedException
	{
		
		//Creating object to MobielInternet class
			MobielInternet mobielInternet = new MobielInternet(driver);
			log.info("******Started smoke test for MobielInternet page******");
				log.info("*****Started Price Validation for MobielInternet*****");

		//Calling Methods from MobielInternet Class
//			mobielInternet.Cookies_Acceptance();
					Thread.sleep(3000);
		
		//Calling Methods from MobielInternet Classs			
			mobielInternet.MobielInternet_MobileInternetLink();
				Thread.sleep(3000);
			
		// Creating Object to PriceValidation
			PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);	
		
		//Calling Methods from PriceValidation Class
			priceValidation_HardwareONly.priceValidation_MobielInternet_pdpPage();		
				priceValidation_HardwareONly.PriceValidation_ShoppingCartPage_ExceptHardware();			
					priceValidation_HardwareONly.PriceValidation_personalDetailsPage_ExceptHardware();	
		
		//Creating object to Personal_Information Class
			Personal_information personal_Information=new Personal_information(driver);	
		//Calling methods from Personal_Informaion class
			personal_Information.personal_Details_TillResidenceDetails();	
				personal_Information.personal_Details_idType();	
					personal_Information.personal_Details_Till_ibanAccountNumber();		
						personal_Information.NextOne();
							Thread.sleep(7000);
		//Calling Methods from PriceValidation Class
			priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_ExceptHardware();
				priceValidation_HardwareONly.pricesValidation_MobielInternet();

				log.info("******Finished smoke test for MobielInternet page******");
					log.info("*****Finished Price Validation for MobielInternet*****");
	}

}
