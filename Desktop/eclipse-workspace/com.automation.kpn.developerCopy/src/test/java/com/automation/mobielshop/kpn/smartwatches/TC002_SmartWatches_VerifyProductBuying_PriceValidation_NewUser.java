package com.automation.mobielshop.kpn.smartwatches;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.telefoons.TC002_phones_VerifyProductBuying_PriceValidation_ExistingUser;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.MobielInternet;
import com.automation.mobielshop.kpn.uiActions.Prepaid;
import com.automation.mobielshop.kpn.uiActions.Smartwatches;
import com.automation.mobielshop.kpn.uiActions.Tablets;

import Helper.WaitHelper;

public class TC002_SmartWatches_VerifyProductBuying_PriceValidation_NewUser extends TestBase {

	public static final Logger log = Logger.getLogger(TC002_SmartWatches_VerifyProductBuying_PriceValidation_NewUser.class.getName());
	
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException{
		//calling init function from testbase class 
		init();
		}
	WaitHelper waitHelper = new WaitHelper(driver);	
	
	@Test
	public void priceValidation_SmartWatches_NotACustomer_EndToEnd() throws InterruptedException
	
	
			{
				
		/***** Validating Price Details For Not an existing Customer ***/			
		
				//creating object to SmartWatches class to use methods in that class
					Smartwatches smartwatches = new Smartwatches(driver);
				//Calling Methods from SmartWatches Class
							Thread.sleep(2000);
								smartwatches.SmartWatchesLink();
									Thread.sleep(1000);
										smartwatches.Smartwatches_product_Buying();
											Thread.sleep(1000);
											
											
				log.info("******Started smoke test for SmartWatches - New customer scenario******");
					log.info("*****Started price validation for Smartwatches - New customer scenario*****");								
				
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
							waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
				// Calling Methods from PriceValidation Class
						priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_HardwareOnly();
							priceValidation_HardwareONly.pricesValidation_HardwareOnly_SmartWatches();
						
					log.info("******Finished smoke test for SmartWatches - new customer scenario******");
						log.info("*****Finished price validation for Smartwatches - new customer scenario*****");	
			
			}
}
