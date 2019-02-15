package com.automation.mobielshop.kpn.simOnly;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.ConfirmationOfDetailsBeforePayment;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Renew;
import com.automation.mobielshop.kpn.uiActions.SimOnly;

public class TC003_simOnly_products_validation_priceDetails extends TestBase{
	

	@BeforeTest
	public void setUp() throws Exception{
		//calling init function from testbase class 
		init();		 
	}
	
	
	@Test	
	public void priceValidation_simOnly_EndToEnd() throws InterruptedException
	{
		// Validating price details for new customer scenario 
				
		//Creating Object to SimOnly CLass
			SimOnly simonly= new SimOnly(driver);
			
			log.info("******Started smoke test for simOnly NewCustomer scenario******");
				log.info("*****Started Price Validation for SimOnly NewCustomer*****");
				
		//Calling Methods from SimOnly class
			simonly.Cookies_Acceptance();
				Thread.sleep(3000);
					simonly.SimOnly_Buying_simOnlyLink();
						Thread.sleep(1000);		
		// Creating Object to PriceValidation
			PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);
		//Callng Methods from PriceValidation Class
			priceValidation_HardwareONly.priceValidation_simOnly_pdpPage();	
			Thread.sleep(3000);
				priceValidation_HardwareONly.PriceValidation_ShoppingCartPage_ExceptHardware();			
					priceValidation_HardwareONly.PriceValidation_personalDetailsPage_ExceptHardware();	
		//Creating object to Personal_Information Class
			Personal_information personal_Information=new Personal_information(driver);	
		//Calling methods from Personal_Informaion class
			personal_Information.personal_Details_TillResidenceDetails();	
				personal_Information.personal_Details_idType();	
					personal_Information.personal_Details_Till_ibanAccountNumber();			
						personal_Information.NextOne();
							Thread.sleep(3000);
		//Callng Methods from PriceValidation Class
			priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_ExceptHardware();
				priceValidation_HardwareONly.pricesValidation_simOnly();
					log.info("******Finished smoke test for simOnly NewCustomer scenario******");
						log.info("*****Finished Price Validation for SimOnly NewCustomer scenario*****");	

		/* Validating price details for existing customer scenario */	
						//Creating Object to TestBase Class
						TestBase testBase = new TestBase();
				//Calling Methods from TestBase class	
						testBase.getUrl(url);			
						Thread.sleep(1000);	
						//creating object to Renew class to use methods in that class
						Renew renew= new Renew(driver);
						log.info("****** Started smoke test for simOnly Existing user ******");
							log.info("****** Started Price Validation for SimOnly existing customer scenario ****** ");
						renew.verlegen("0658710845" , "12345");
						Thread.sleep(1000);
						renew.simOnly();
						log.info("Clicked on simOnly link on renewal page");
						Thread.sleep(1000);
						
							
					//Callng Methods from PriceValidation Class
						priceValidation_HardwareONly.priceValidation_simOnly_pdpPage();	
						Thread.sleep(1000);
							priceValidation_HardwareONly.PriceValidation_ShoppingCartPage_ExceptHardware();		
							Thread.sleep(1000);
								priceValidation_HardwareONly.priceDetailsValidation_simOnly_personalDetailsPage_Renew();	
								
							//Calling methods from Personal_Informaion class	
								personal_Information.NextOne();
								
										Thread.sleep(2000);
					//Callng Methods from PriceValidation Class
						priceValidation_HardwareONly.priceDetailsValidation_simOnly_checkOutPage_Renew();						
						
						//Creating object to ConfirmationOfDetailsBeforePayment class to use methods in that class
						ConfirmationOfDetailsBeforePayment confirmationOfDetailsBeforePayment = new ConfirmationOfDetailsBeforePayment(driver);	
				//Calling Methods from ConfirmationOfDetailsBeforePayment		
						confirmationOfDetailsBeforePayment.ConfirmationOfDetailsBeforePaymentMethod_DierectPayment();	
						priceValidation_HardwareONly.priceDetailsValidation_simOnly_Renew();
							log.info("****** Finished smoke test for simOnly Existing user scenario******");
								log.info("****** Finished Price Validation for SimOnly existing customer scenario ****** ");					
							
						
						
	}
}