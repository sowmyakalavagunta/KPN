package com.automation.mobielshop.kpn.telefoons;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.testBase.extraCheckOfDevicePayment;
import com.automation.mobielshop.kpn.uiActions.Telephones;

import Helper.WaitHelper;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC001_phones_VerifyiProductBuying_PriceValidation_NewUser extends TestBase {
	public static final Logger log = Logger.getLogger(TC001_phones_VerifyiProductBuying_PriceValidation_NewUser.class.getName());

	WebDriver driver;
//	WaitHelper waitHelper = new WaitHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException{
		//calling init function from testbase class 
		init();
		this.driver=TestBase.driver;
		}

	
	@Test
	public void Telefoons_VerifyProductBuying() throws InterruptedException, AWTException {
		
		log.info("=========== Started Telefoons VerifyiProductBuying Test =============");
		
	//creating object to Telephones class to use methods in that class
		Telephones telephones = new Telephones(driver);	
			telephones.priceValidation_Phones_EndToEnd();
				waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
					// Creating Object to PriceValidation
						PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);	
					// Calling Methods from PriceValidation Class
						priceValidation_HardwareONly.priceValidation_TelephonesAndTablets_pdpPage();
							waitHelper.pageLoadTime(10,TimeUnit.SECONDS);
								priceValidation_HardwareONly.PriceValidation_ShoppingCartPage_ExceptHardware();
									waitHelper.pageLoadTime(20,TimeUnit.SECONDS);
						
					//calling Methods from extraCheckOfDevicePayment
						extraCheckOfDevicePayment ExtraCheckOfDevicePayment=new extraCheckOfDevicePayment(driver);
					//Calling methods from extraCheckOfDevicePayment class
						ExtraCheckOfDevicePayment.extraCheckOfDevicePaymentMethod();
							waitHelper.setImplicitWait(20,TimeUnit.SECONDS);
						
								priceValidation_HardwareONly.PriceValidation_personalDetailsPage_ExceptHardware();
								//Creating object to Personal_Informaion class to use methods in that class
									Personal_information personal_Information=new Personal_information(driver);		
								//Calling methods from Personal_Informaion class
									personal_Information.personal_Details_TillResidenceDetails();	
									waitHelper.pageLoadTime(20,TimeUnit.SECONDS);
									personal_Information.personal_Details_idType();
									personal_Information.personal_Details_Till_ibanAccountNumber();			
							
								personal_Information.NextOne();
				// Calling Methods from PriceValidation Class
								priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_ExceptHardware();
									priceValidation_HardwareONly.pricesValidation_TelephonesAndTablets();
						
						log.info("*****Finished Price details Validation started in Telephones*****");
							log.info("******Finished Smoke test for telephones new user scenario******");

	} 
}