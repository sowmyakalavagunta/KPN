package com.automation.mobielshop.kpn.tablets;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.automation.mobielshop.kpn.testBase.ConfirmationOfDetailsBeforePayment;
import com.automation.mobielshop.kpn.testBase.Personal_information;
import com.automation.mobielshop.kpn.testBase.PriceValidation_HardwareOnly;
import com.automation.mobielshop.kpn.testBase.TestBase;
import com.automation.mobielshop.kpn.testBase.extraCheckOfDevicePayment;
import com.automation.mobielshop.kpn.uiActions.MobielInternet;
import com.automation.mobielshop.kpn.uiActions.Tablets;

import Helper.WaitHelper;

public class TC001_Tablets_VerifyProductBuying_PriceValidation_WithSubscription extends TestBase{
	WebDriver driver;
	public static final Logger log1 = Logger.getLogger(TC001_Tablets_VerifyProductBuying_PriceValidation_WithSubscription.class.getName());
	
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException{
		//calling init function from testbase class 
		init();
		this.driver=TestBase.driver;
		}
	
	WaitHelper waitHelper = new WaitHelper(driver);
	
	
	@Test
	public void priceValidation_Tablets_withSubscription_EndToEnd() throws InterruptedException
			{
				//creating object to tablets class to use methods in that class
				Tablets tablets = new Tablets(driver);
				
					log.info("******Started smoke test for Tablets-with Subscription scenario******");
							log.info("*****Started price validation for Tablets with Subscription scenario*****");
					
				tablets.priceValidation_Tablets_EndToEnd();	
				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
				
			// Creating Object to PriceValidation
				PriceValidation_HardwareOnly priceValidation_HardwareONly = new PriceValidation_HardwareOnly(driver);
			// Calling Methods from PriceValidation Class
				priceValidation_HardwareONly.priceValidation_TelephonesAndTablets_pdpPage();
				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
				priceValidation_HardwareONly.PriceValidation_ShoppingCartPage_ExceptHardware();	
				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
			
			//calling Methods from extraCheckOfDevicePayment
				extraCheckOfDevicePayment ExtraCheckOfDevicePaymenat=new extraCheckOfDevicePayment(driver);
			//Calling methods from extraCheckOfDevicePayment class
				ExtraCheckOfDevicePaymenat.extraCheckOfDevicePaymentMethod();	
				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
				priceValidation_HardwareONly.PriceValidation_personalDetailsPage_ExceptHardware();
				
			//Creating object to Personal_Information Class
				Personal_information personal_Information=new Personal_information(driver);	
			//Calling methods from Personal_Informaion class
				personal_Information.personal_Details_TillResidenceDetails();	
				personal_Information.personal_Details_idType();	
				personal_Information.personal_Details_Till_ibanAccountNumber();			
				personal_Information.NextOne();
				waitHelper.pageLoadTime(10, TimeUnit.SECONDS);
			
			//Calling Methods from priceValidation calss
				priceValidation_HardwareONly.PriceValidation_FromPersoanlDetailsPage_ExceptHardware();		
				priceValidation_HardwareONly.pricesValidation_TelephonesAndTablets();
				log.info("******Finished smoke test for Tablets -with subscription scenario******");	
	}
	
}
