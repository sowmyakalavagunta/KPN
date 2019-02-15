package com.automation.mobielshop.kpn.smartwatches;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Smartwatches;

public class TC003_SmartWatches_products_validation_priceDetails extends TestBase {

	@BeforeClass
	public void setUp() throws Exception{
		//calling init function from testbase class 
		init();
		}
	
	@Test
	public void priceValidation_SmartWatches_NotACustomer_EndToEnd() throws InterruptedException
			{
				
		/***** Validating Price Details For NotACustomer ***/			

				//creating object to SmartWatches class to use methods in that class
					Smartwatches smartwatches = new Smartwatches(driver);
				//Calling Methods from SmartWatches Class
						smartwatches.Cookies_Acceptance();
							Thread.sleep(7000);
								smartwatches.SmartWatchesLink();
									Thread.sleep(1000);
									log.info("******Started Filters Validation Test on SmartWatches page******");
										smartwatches.Apple_Brand_validation();
											smartwatches.Filter_colour_Zwart();
												smartwatches.Filter_OS_Apple();	
												log.info("******Finished Filters Validation Test on SmartWatches page******");
													smartwatches.SmartWatchesLink();
													Thread.sleep(2000);
														smartwatches.Smartwatches_product_Buying();
															Thread.sleep(1000);
				log.info("******Started smoke test for SmartWatches - new customer scenario******");
					log.info("*****Started price validation for Smartwatches - new customer scenario*****");								
				// Creating Object to PriceValidation
						PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);
						priceValidation_HardwareONly.priceValidation_SmartWatches_pdpPage();						
				// Calling Methods from PriceValidation Class	
						priceValidation_HardwareONly.PriceValidation_FromShoppingCartPageToPersoanlDetailsPage_HardwareOnly();				
				//Creating object to Personal_Information Class
						Personal_information personal_Information=new Personal_information(driver);	
				//calling Methods from Personal_Information Class
						personal_Information.personal_Details_TillResidenceDetails();				
							personal_Information.NextOne();				
								Thread.sleep(7000);	
				// Calling Methods from PriceValidation Class
						priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_HardwareOnly();
							priceValidation_HardwareONly.pricesValidation_HardwareOnly_SmartWatches();
								log.info("******Finished smoke test for SmartWatches - new customer scenario******");
									log.info("*****Finished price validation for Smartwatches - new customer scenario*****");	
		/***** Validating Price Details For Already Customer ***/
				//Creating Object to TestBase Class
					TestBase testBase = new TestBase();
				//Calling Methods from TestBase class	
					testBase.getUrl(url);			
					Thread.sleep(1000);
					log.info("******Started smoke test for SmartWatches - AlreadyCustomer scenario******");	
						log.info("*****Started Price Validation for SmartWatches - AlreadyCustomer scenario*****");	
				//Calling Methods from SmartWatches Class
						smartwatches.SmartWatchesLink();
							Thread.sleep(1000);
						smartwatches.Smartwatches_product_Buying();
							Thread.sleep(1000);
						smartwatches.Smartwatches_product_Buying_AlreadyCustomer();
							priceValidation_HardwareONly.priceValidation_SmartWatches_pdpPage();
								Thread.sleep(1000);
				
				// Calling Methods from PriceValidation Class			
						priceValidation_HardwareONly.PriceValidation_FromShoppingCartPageToPersoanlDetailsPage_HardwareOnly();				
				
				//calling Methods from Personal_Information Class
					personal_Information.personal_Details_TillResidenceDetails();				
						personal_Information.NextOne();				
							Thread.sleep(7000);				
				
				// Calling Methods from PriceValidation Class	
							priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_HardwareOnly();
							priceValidation_HardwareONly.pricesValidation_HardwareOnly_SmartWatches();
								log.info("******Finished smoke test for SmartWatches - AlreadyCustomer scenario******");	
									log.info("*****Finished Price Validation for SmartWatches - AlreadyCustomer*****");	
			}
}
