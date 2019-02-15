package com.automation.mobielshop.kpn.simOnly;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.SimOnly;

public class TC001_simOnly_verifyProdctBuying_NewUser extends TestBase {
	public static final Logger log = Logger.getLogger(TC001_simOnly_verifyProdctBuying_NewUser.class.getName());
	
	
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException{
		 init();		 
	}	
	
	
	@Test
	public void SimOnly_VerifyProductBuying() throws InterruptedException {
		
		//Creating Object to SimOnly CLass
			SimOnly simonly= new SimOnly(driver);
				log.info("******Started smoke test for simOnly NewCustomer scenario******");
				log.info("*****Started Price Validation for SimOnly NewCustomer*****");
				Thread.sleep(3000);	
		
		//Calling Methods from SimOnly class
			simonly.SimOnly_Buying_simOnlyLink();
			Thread.sleep(5000);				
				
			// Creating Object to PriceValidation
				PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);
			
			//Callng Methods from PriceValidation Class
				priceValidation_HardwareONly.priceValidation_simOnly_pdpPage();
				Thread.sleep(2000);
						priceValidation_HardwareONly.PriceValidation_ShoppingCartPage_ExceptHardware();		
							Thread.sleep(2000);
								priceValidation_HardwareONly.PriceValidation_personalDetailsPage_ExceptHardware();	
									Thread.sleep(2000);
									
									
			//Creating object to Personal_Information Class
				Personal_information personal_Information=new Personal_information(driver);	
			//Calling methods from Personal_Informaion class
				personal_Information.personal_Details_TillResidenceDetails();	
					personal_Information.personal_Details_idType();	
						personal_Information.personal_Details_Till_ibanAccountNumber();			
							personal_Information.NextOne();
							Thread.sleep(7000);
			//Callng Methods from PriceValidation Class
				priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_ExceptHardware();
					priceValidation_HardwareONly.pricesValidation_simOnly();
						log.info("******Finished smoke test for simOnly NewCustomer scenario******");
							log.info("*****Finished Price Validation for SimOnly NewCustomer scenario*****");
			}  	
			
	
/*	@AfterTest
		   public void endTest()
		   {
					
				log.info("============= Finished SimOnly VerifyiProductBuying Test============");
				driver.close();
		   }*/
}
