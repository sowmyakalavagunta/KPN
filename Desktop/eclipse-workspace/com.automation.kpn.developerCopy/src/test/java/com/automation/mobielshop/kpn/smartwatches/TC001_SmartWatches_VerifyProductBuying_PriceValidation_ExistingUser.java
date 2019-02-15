package com.automation.mobielshop.kpn.smartwatches;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Smartwatches;

import Helper.WaitHelper;

public class TC001_SmartWatches_VerifyProductBuying_PriceValidation_ExistingUser extends TestBase {
	WebDriver driver;
public static final Logger log1 = Logger.getLogger(TC001_SmartWatches_VerifyProductBuying_PriceValidation_ExistingUser.class.getName());
	
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException{
		 init();
		 this.driver=TestBase.driver;
		 }	
	WaitHelper waitHelper = new WaitHelper(driver);
	@Test
	public void Smartwatches_VerifyProductBuying() throws InterruptedException{
		
		log.info("******Started smoke test for SmartWatches - AlreadyCustomer scenario******");	
			log.info("*****Started Price Validation for SmartWatches - AlreadyCustomer scenario*****");
		
		//creating object to SmartWatches class to use methods in that class
			Smartwatches smartwatches = new Smartwatches(driver);
				smartwatches.SmartWatchesLink();
				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
						smartwatches.Smartwatches_product_Buying();
						waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
								smartwatches.Smartwatches_product_Buying_AlreadyCustomer();
									log.info("Clicked on Already cutomer button on pdp page");
				
				// Creating Object to PriceValidation
						PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);
				// Calling methods from  PriceValidation
						priceValidation_HardwareONly.priceValidation_SmartWatches_pdpPage();
						waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
		
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
										
					log.info("******Finished smoke test for SmartWatches - AlreadyCustomer scenario******");	
						log.info("*****Finished Price Validation for SmartWatches - AlreadyCustomer*****");	
				}
				

}