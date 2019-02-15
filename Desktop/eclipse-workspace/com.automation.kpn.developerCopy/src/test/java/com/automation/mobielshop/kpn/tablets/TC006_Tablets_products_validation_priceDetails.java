package com.automation.mobielshop.kpn.tablets;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.automation.mobielshop.kpn.testBase.ConfirmationOfDetailsBeforePayment;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.testBase.extraCheckOfDevicePayment;
import com.automation.mobielshop.kpn.uiActions.Tablets;

public class TC006_Tablets_products_validation_priceDetails extends TestBase{

	@BeforeClass
		public void setUp() throws Exception{
			//calling init function from testbase class 
			init();
			}
		
	@Test
	public void priceValidation_Tablets_withSubscription_EndToEnd() throws InterruptedException
			{
				//creating object to tablets class to use methods in that class
					Tablets tablets = new Tablets(driver);
						//Calling Methods from tablets class
							tablets.Cookies_Acceptance();
							Thread.sleep(3000);	
								log.info("******Started Filters Validation Test on Tablets page******");
									tablets.Apple_Brand_validation();
									tablets.Filter_colour_Zwart();
									tablets.Filter_OS_Android();			
										log.info("******Finished  Filters Validation Test on Tablets Page******");	
											log.info("******Started smoke test for Tablets-with Subscription scenario******");
												log.info("*****Started price validation for Tablets with Subscription scenario*****");
													tablets.priceValidation_Tablets_EndToEnd();	
			// Creating Object to PriceValidation
				PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);
			// Calling Methods from PriceValidation Class
				priceValidation_HardwareONly.priceValidation_TelephonesAndTablets_pdpPage();
				Thread.sleep(1000);
				priceValidation_HardwareONly.PriceValidation_ShoppingCartPage_ExceptHardware();	
				Thread.sleep(1000);
			
			//calling Methods from extraCheckOfDevicePayment
				extraCheckOfDevicePayment ExtraCheckOfDevicePaymenat=new extraCheckOfDevicePayment(driver);
			//Calling methods from extraCheckOfDevicePayment class
				ExtraCheckOfDevicePaymenat.extraCheckOfDevicePaymentMethod();	
				Thread.sleep(1000);
				priceValidation_HardwareONly.PriceValidation_personalDetailsPage_ExceptHardware();
				
			//Creating object to Personal_Information Class
				Personal_information personal_Information=new Personal_information(driver);	
			//Calling methods from Personal_Informaion class
				personal_Information.personal_Details_TillResidenceDetails();	
				personal_Information.personal_Details_idType();	
				personal_Information.personal_Details_Till_ibanAccountNumber();			
				personal_Information.NextOne();
				Thread.sleep(1000);
			
			//Calling Methods from priceValidation calss
				priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_ExceptHardware();		
				priceValidation_HardwareONly.pricesValidation_TelephonesAndTablets();
				log.info("******Finished smoke test for Tablets -with subscription scenario******");	
					log.info("============================================================================");
						log.info("******Started Smoke test for Tablets-withOut Subscription scenario******");
							log.info("******Started Price Validation for Tablets withOut Subscription scenario******");
							
			//Creating Object to TestBase Class
				TestBase testBase = new TestBase();
			//Calling Methods from TestBase class	
				testBase.getUrl(url);			
				Thread.sleep(1000);
					tablets.Tablets_product_Buying();
						Thread.sleep(1000);	
							tablets.Tablets_product_Buying_withoutsubscription();
								Thread.sleep(1000);	
													
			//Calling Methods from priceValidation calss
				priceValidation_HardwareONly.priceValidation_Tablets_withoutSubscription_pdpPage();
				Thread.sleep(1000);	
				priceValidation_HardwareONly.PriceValidation_FromShoppingCartPageToPersoanlDetailsPage_HardwareOnly();		
				Thread.sleep(1000);
				
				//calling Methods from Personal_Information Class
					personal_Information.personal_Details_TillResidenceDetails();				
					personal_Information.NextOne();				
					Thread.sleep(1000);	
				
					
				// Calling Methods from PriceValidation Class
					priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_HardwareOnly();
					priceValidation_HardwareONly.pricesValidation_HardwareOnly_TabletsWithoutSubscription();
				
				//Creating object to ConfirmationOfDetailsBeforePayment class
					ConfirmationOfDetailsBeforePayment confirmationOfDetailsBeforePayment = new ConfirmationOfDetailsBeforePayment(driver);
				//Calling methods from confirmationOfDetailsBeforePayment class
					confirmationOfDetailsBeforePayment.Payment_Online_Bank_page();
					
					log.info("******Finished Smoke test for Tablets-withOut Subscription scenario******");
						log.info("******Finished Price Validation for Tablets withOut subscription scenario******");	
					
		
	}
	
}
