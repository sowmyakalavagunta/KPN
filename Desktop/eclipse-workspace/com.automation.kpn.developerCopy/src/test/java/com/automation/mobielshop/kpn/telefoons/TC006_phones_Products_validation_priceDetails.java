package com.automation.mobielshop.kpn.telefoons;

import java.awt.AWTException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.automation.mobielshop.kpn.testBase.ConfirmationOfDetailsBeforePayment;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.testBase.extraCheckOfDevicePayment;
import com.automation.mobielshop.kpn.uiActions.Renew;
import com.automation.mobielshop.kpn.uiActions.Telephones;

public class TC006_phones_Products_validation_priceDetails extends TestBase {
	
	@BeforeClass
	public void setUp() throws Exception{
		//calling init function from testbase class 
		init();
		}
	
	
	@Test
	public void priceValidation_Phones_EndToEnd() throws InterruptedException, AWTException
			{
			//creating object to Telephones class to use methods in that class
				Telephones telephones = new Telephones(driver);
			//Calling Methods from Teleph ones Class	
				Thread.sleep(7000);
//				telephones.Cookies_Acceptance();
					Thread.sleep(7000);
					log.info("******Started  Filters Validation Test on Telephones Page******");	
						telephones.Apple_Brand();
							telephones.Filter_colour_Zwart();
							
							((JavascriptExecutor) driver).executeScript(
					                "window.scrollTo(409, 453)");
							Thread.sleep(2000);
								telephones.Filter_OS_Android();									
					log.info("******Finished  Filters Validation Test on Telephones Page******");	

				log.info("******Started smoke test for telephones new user scenario******");
				log.info("*****Price details Validation started in telephones new user scenario *****");
						Thread.sleep(3000);				
							telephones.priceValidation_Phones_EndToEnd();
				// Creating Object to PriceValidation
				PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);	
				// Calling Methods from PriceValidation Class
				priceValidation_HardwareONly.priceValidation_TelephonesAndTablets_pdpPage();
				Thread.sleep(1000);	
					priceValidation_HardwareONly.PriceValidation_ShoppingCartPage_ExceptHardware();
						Thread.sleep(1000);	
			//creating  Methods to extraCheckOfDevicePayment
				extraCheckOfDevicePayment ExtraCheckOfDevicePaymenat=new extraCheckOfDevicePayment(driver);
			//Calling methods from extraCheckOfDevicePayment class 
				ExtraCheckOfDevicePaymenat.extraCheckOfDevicePaymentMethod();
					Thread.sleep(2000);		
			// Calling Method from PriceValidation Class
				priceValidation_HardwareONly.PriceValidation_personalDetailsPage_ExceptHardware();
			//Creating object to Personal_Information Class
				Personal_information personal_Information=new Personal_information(driver);
			//Calling methods from Personal_Informaion class
				personal_Information.personal_Details_TillResidenceDetails();	
					personal_Information.personal_Details_idType();	
						personal_Information.personal_Details_Till_ibanAccountNumber();			
							personal_Information.NextOne();
								Thread.sleep(1000);
			// Calling Methods from PriceValidation Class
				priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_ExceptHardware();
					priceValidation_HardwareONly.pricesValidation_TelephonesAndTablets();
				
					Thread.sleep(2000);	
			//Creating object to ConfirmationOfDetailsBeforePayment class to use methods in that class
					ConfirmationOfDetailsBeforePayment confirmationOfDetailsBeforePayment = new ConfirmationOfDetailsBeforePayment(driver);	
			//Calling Methods from ConfirmationOfDetailsBeforePayment		
					confirmationOfDetailsBeforePayment.ConfirmationOfDetailsBeforePaymentMethod_FurtherPaymentPage();
				log.info("*****Finished Price details Validation started in Telephones*****");
					log.info("******Finished Smoke test for telephones new user scenario******");	
		
							log.info("******started smoke test for Telephones existing user ******");
								log.info("****** Started Price details validation for telephones existing user ******");
			//Creating Object to TestBase Class
					TestBase testBase = new TestBase();
			//Calling Methods from TestBase class	
					testBase.getUrl(url);			
						Thread.sleep(1000);			
				
			//creating object to Renew class to use methods in that class
					Renew renew= new Renew(driver);
						renew.verlegen("0658710845" , "12345");
						
						Thread.sleep(3000);	
							renew.telephones();
							Thread.sleep(3000);
				log.info("******Started Price details validation for Telephones existinguser******");	
				
				
			//calling methods from telephones page
				telephones.priceValidation_Phones_EndToEnd();
					Thread.sleep(3000);
					
					// Creating Object to PriceValidation
					
			// Calling Methods from PriceValidation Class
					priceValidation_HardwareONly.PriceValidation_PdpPageTelephones_Renew();
					Thread.sleep(3000);
						priceValidation_HardwareONly.PriceValidation_ShoppingCartPageTelephones_Renew();
								
							//creating  Methods to extraCheckOfDevicePayment
							
							//Calling methods from extraCheckOfDevicePayment class
							ExtraCheckOfDevicePaymenat.extraCheckOfDevicePaymentMethod();
							Thread.sleep(3000);	
							
							priceValidation_HardwareONly.PriceValidation_PersoanlDetailsPage_Telephones_Renew();
							Thread.sleep(3000);
				//Creating object to Personal_Information Class
							
							
			//Calling methods from Personal_Informaion class							
					personal_Information.NextOne();
						Thread.sleep(3000);			
						
						priceValidation_HardwareONly.priceDetailsValidation_Telephones_checkOutPage_Renew();
						
						
						//Creating object to ConfirmationOfDetailsBeforePayment class to use methods in that class
						
							confirmationOfDetailsBeforePayment.ConfirmationOfDetailsBeforePaymentMethod_FurtherPaymentPage();
				
				
					priceValidation_HardwareONly.priceDetailsValidation_Telephones_Renew();
						log.info("******Finished Price details validation for Telephones existinguser******");
							log.info("******Finished smoke test for Telephones existing user ******");
			}
	}