package com.automation.mobielshop.kpn.telefoons;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.mobielshop.kpn.testBase.ConfirmationOfDetailsBeforePayment;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.testBase.extraCheckOfDevicePayment;
import com.automation.mobielshop.kpn.uiActions.Renew;
import com.automation.mobielshop.kpn.uiActions.Telephones;

import Helper.WaitHelper;

public class TC002_phones_VerifyProductBuying_PriceValidation_ExistingUser extends TestBase {
	WaitHelper waitHelper = new WaitHelper(driver);
	
	public static final Logger log = Logger.getLogger(TC002_phones_VerifyProductBuying_PriceValidation_ExistingUser.class.getName());
	
	Renew renew;
	
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException{
		//calling init function from testbase class 
		init();	
	}
	
	@Test
	public void ExistingUserRenew() throws InterruptedException, AWTException
	{
		
		//creating object to Telephones class to use methods in that class
			Telephones telephones = new Telephones(driver);	
			waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
					//creating object to Renew class to use methods in that class
						Renew renew= new Renew(driver);
							renew.verlegen("0658710845","12345");
								renew.telephones();
								waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
									
			log.info("******Started Price details validation for Telephones existinguser******");				
		//calling methods from telephones page
			telephones.priceValidation_Phones_EndToEnd();
			waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
				
				// Creating Object to PriceValidation
					PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);	
				// Calling Methods from PriceValidation Class
					priceValidation_HardwareONly.PriceValidation_PdpPageTelephones_Renew();
					waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
					priceValidation_HardwareONly.PriceValidation_ShoppingCartPageTelephones_Renew();
					waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
					
						//creating  object to extraCheckOfDevicePayment
						extraCheckOfDevicePayment ExtraCheckOfDevicePaymenat=new extraCheckOfDevicePayment(driver);
						
						//Calling methods from extraCheckOfDevicePayment class
						ExtraCheckOfDevicePaymenat.extraCheckOfDevicePaymentMethod();
						
						waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
						
						priceValidation_HardwareONly.PriceValidation_PersoanlDetailsPage_Telephones_Renew();
						waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
						
						//Creating object to Personal_Information Class
						Personal_information personal_Information=new Personal_information(driver);
						
						//Calling methods from Personal_Informaion class							
							personal_Information.NextOne();
							waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
							
							
								priceValidation_HardwareONly.priceDetailsValidation_Telephones_checkOutPage_Renew();
								waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
								
								//Creating object to ConfirmationOfDetailsBeforePayment class to use methods in that class
										ConfirmationOfDetailsBeforePayment confirmationOfDetailsBeforePayment = new ConfirmationOfDetailsBeforePayment(driver);
										confirmationOfDetailsBeforePayment.ConfirmationOfDetailsBeforePaymentMethod_FurtherPaymentPage();
						
					priceValidation_HardwareONly.priceDetailsValidation_Telephones_Renew();
						
						
					log.info("******Finished Price details validation for Telephones existinguser******");
						log.info("******Finished smoke test for Telephones existing user ******");
	}
	
	}

