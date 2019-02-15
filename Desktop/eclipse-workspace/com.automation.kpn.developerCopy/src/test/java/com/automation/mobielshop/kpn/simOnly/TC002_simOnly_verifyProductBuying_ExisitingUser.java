package com.automation.mobielshop.kpn.simOnly;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.ConfirmationOfDetailsBeforePayment;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.uiActions.Renew;

public class TC002_simOnly_verifyProductBuying_ExisitingUser extends TestBase {

	public static final Logger log = Logger.getLogger(TC002_simOnly_verifyProductBuying_ExisitingUser.class.getName());
	
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException{
		//calling init function from testbase class 
		init();		 
	}
	
	
	@Test
	public void ExistingUserRenew() throws InterruptedException
	{
	
		//creating object to Renew class to use methods in that class
			Renew renew= new Renew(driver);
				log.info("****** Started smoke test for simOnly Existing user scenario******");
				log.info("****** Started Price Validation for SimOnly existing customer scenario ****** ");	
				Thread.sleep(5000);
					System.out.println("============================================================================================");
					renew.verlegen("0658710845" , "12345");		
					System.out.println("============================================================================================");
					Thread.sleep(3000);
					renew.simOnly();
						log.info("Clicked on simOnly link on renewal page");
						Thread.sleep(3000);
						
	// Creating Object to PriceValidation
		PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);
	//Callng Methods from PriceValidation Class
		priceValidation_HardwareONly.priceValidation_simOnly_pdpPage();		
			Thread.sleep(3000);
				priceValidation_HardwareONly.PriceValidation_ShoppingCartPage_ExceptHardware();		
					Thread.sleep(3000);
						priceValidation_HardwareONly.priceDetailsValidation_simOnly_personalDetailsPage_Renew();	
			//Creating object to Personal_Information Class
					Personal_information personal_Information=new Personal_information(driver);	
			//Calling methods from Personal_Informaion class	
					personal_Information.NextOne();
						Thread.sleep(3000);
			//Callng Methods from PriceValidation Class
					priceValidation_HardwareONly.priceDetailsValidation_simOnly_checkOutPage_Renew();						
						Thread.sleep(3000);
			//Creating object to ConfirmationOfDetailsBeforePayment class to use methods in that class
					ConfirmationOfDetailsBeforePayment confirmationOfDetailsBeforePayment = new ConfirmationOfDetailsBeforePayment(driver);	
			//Calling Methods from ConfirmationOfDetailsBeforePayment		
								confirmationOfDetailsBeforePayment.ConfirmationOfDetailsBeforePaymentMethod_DierectPayment();	
									priceValidation_HardwareONly.priceDetailsValidation_simOnly_Renew();
										log.info("****** Finished smoke test for simOnly Existing user scenario******");
											log.info("****** Finished Price Validation for SimOnly existing customer scenario ****** ");		
		}  	

//	
//	@AfterMethod
//	public void failedsimOnlyScreenshots()
//	{
//		Screenshot screenshot= new Screenshot();
//		screenshot.captureScreenShot(driver);
//	}
	
	
	/*@AfterTest
	public void endTest()
	{
		log.info("=============Finished Exisiting Customer Renew - SimOnly VerifyiProductBuying Test===========");
		driver.close();
	}*/
	
}
